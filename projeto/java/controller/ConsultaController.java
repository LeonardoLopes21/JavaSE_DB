package projeto.java.controller;

import controller.MedicoController;
import controller.PacienteController;
import models.Consulta;
import models.Medico;
import models.Paciente;
import services.BD;
import services.Formatter;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;


public class ConsultaController {

    public static void registerConsulta(Consulta c){

        Connection conn = BD.connect();

        String sqlText = "INSERT INTO consultas(paciente, medico, datamarcada, hora) VALUES(?,?,?,?)";
        try {
            PreparedStatement statement = conn.prepareStatement(sqlText);
            statement.setString(1, c.getPaciente().getNome());
            statement.setString(2, c.getMedico().getNome());
            statement.setDate(3, Date.valueOf(c.getData()));
            statement.setTime(4, Time.valueOf(c.getHora()));
            if(statement.executeUpdate() > 0){
                System.out.println("Consulta Cadastrada!");
            }
        } catch (SQLException e) {
            System.out.println("ERRO SQL" + e);
        } catch (Exception e){
            System.out.println("Erro desconhecido!" + e);
        }

        BD.end(conn);

    }

    public static void printConsulta(Consulta c){
        System.out.println("========================================");
        System.out.println("ID: " + c.getId());
        System.out.println("Paciente: " + c.getPaciente().getNome());
        System.out.println("Medico: " + c.getMedico().getNome());
        System.out.println("Data: " + Formatter.fixLocalDateFormatting(c.getData()));
        System.out.println("Hora: " + Formatter.formatHour(c.getHora()));
        System.out.println("========================================");
    }

    public static ArrayList<Consulta> getAllConsultas(){
        Connection conn = BD.connect();
        ArrayList consultas = new ArrayList<Consulta>();
        try{
            String sqlText = "SELECT * FROM consultas";
            Statement s = conn.createStatement();
            ResultSet resultados = s.executeQuery(sqlText);
            while(resultados.next()){
                consultas.add(new Consulta(resultados.getInt("id"),
                        PacienteController.findPacientesByName(PacienteController.getAllPacientes(), resultados.getString("paciente")),
                        MedicoController.findMedicsByName(resultados.getString("medico")),
                        resultados.getTimestamp("datamarcada").toLocalDateTime().toLocalDate(),
                        resultados.getTime("hora").toLocalTime()));
            }
        } catch (SQLException e){
            System.out.println("Erro de conexão!");
        }
        BD.end(conn);
        return consultas;
    }

    public static ArrayList<Consulta> getAllConsultasIfScheduledForToday(){
        Connection conn = BD.connect();
        ArrayList<Consulta> allConsultas = ConsultaController.getAllConsultas();
        
        ArrayList<Consulta> consultasBirthdayToday = new ArrayList<Consulta>();
        
        for(Consulta c : allConsultas){
            if(c.getData().equals(LocalDate.now())){
                consultasBirthdayToday.add(c);
            }
        }

        BD.end(conn);
        return consultasBirthdayToday;
    }
    
    public static ArrayList<Consulta> getAllConsultasBySpecialty(String specialty){
        Connection conn = BD.connect();
        ArrayList<Consulta> allConsultas = ConsultaController.getAllConsultas();
        
        ArrayList<Consulta> consultasCorrectSpecialty = new ArrayList<Consulta>();
        
        for(Consulta c: allConsultas){
            if(c.getMedico().getEspecialidade().equals(specialty)){
                consultasCorrectSpecialty.add(c);
            }
        }
        
        BD.end(conn);
        
        return consultasCorrectSpecialty;

        
    }
    
    public static ArrayList<Consulta> getAllConsultasByPatient(Paciente p){
        Connection conn = BD.connect();
        ArrayList<Consulta> allConsultas = ConsultaController.getAllConsultas();
        
        ArrayList<Consulta> consultasByPatient = new ArrayList<Consulta>();
        
        for(Consulta c: allConsultas){
            if(c.getPaciente().equals(p)){
                consultasByPatient.add(c);
            }
        }
        
        BD.end(conn);
        
        return consultasByPatient;

        
    }
    
    public static ArrayList<Consulta> getAllConsultasByDoctor(Medico m){
        Connection conn = BD.connect();
        ArrayList<Consulta> allConsultas = ConsultaController.getAllConsultas();
        
        ArrayList<Consulta> consultasByDoctor = new ArrayList<Consulta>();
        
        for(Consulta c: allConsultas){
            if(c.getMedico().equals(m)){
                consultasByDoctor.add(c);
            }
        }
        
        BD.end(conn);
        
        return consultasByDoctor;

        
    }

}
