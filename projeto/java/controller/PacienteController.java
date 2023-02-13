package controller;

import models.Medico;
import models.Paciente;
import services.BD;
import services.Formatter;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;


public class PacienteController {

    public static void registerPaciente(Paciente p){

        Connection conn = BD.connect();

        String sqlText = "INSERT INTO pacientes(nome, cpf, nascimento, telefone) VALUES(?,?,?,?)";
        try {
            PreparedStatement statement = conn.prepareStatement(sqlText);
            statement.setString(1, p.getNome());
            statement.setString(2, p.getCpf());
            statement.setDate(3, java.sql.Date.valueOf(p.getDataNasci()));
            statement.setString(4, p.getTel());
            if(statement.executeUpdate() > 0){
                System.out.println("Paciente Cadastrado!");
            }
        } catch (SQLException e) {
            System.out.println("ERRO SQL" + e);
        } catch (Exception e){
            System.out.println("Erro desconhecido!" + e);
        }

        BD.end(conn);

    }

    public static void printPacientes(Paciente p){
        System.out.println("========================================");
        System.out.println("ID: " + p.getId());
        System.out.println("Nome: " + p.getNome());
        System.out.println("CPF: " + p.getCpf());
        System.out.println("Data de nascimento: " + Formatter.fixLocalDateFormatting(p.getDataNasci()));
        System.out.println("Telefone: " + p.getTel());
        System.out.println("========================================");
    }

    public static ArrayList<Paciente> getAllPacientes(){
        Connection conn = BD.connect();
        ArrayList pacientes = new ArrayList<Medico>();
        try{
            String sqlText = "SELECT * FROM pacientes";
            Statement s = conn.createStatement();
            ResultSet resultados = s.executeQuery(sqlText);
            while(resultados.next()){
                pacientes.add(new Paciente(resultados.getInt("id"), resultados.getString("nome"), resultados.getString("cpf"), resultados.getTimestamp("nascimento").toLocalDateTime().toLocalDate(), resultados.getString("telefone")));
            }
        } catch (SQLException e){
            System.out.println("Erro de conexão!");
        }
        BD.end(conn);
        return pacientes;
    }

    public static Paciente findPacientesByName(ArrayList<Paciente> allPacientes, String nome){

        Paciente patient = new Paciente();

        for(Paciente p: allPacientes){

            if(p.getNome().equals(nome)){
                patient = p;
            }

        }

        return patient;

    }

    public static ArrayList<Paciente> getAllPacientesIfBirthMonthNow(){
        Connection conn = BD.connect();
        ArrayList pacientes = new ArrayList<Paciente>();
        try{
            String sqlText = "SELECT * FROM pacientes Where MONTH(nascimento) = " + LocalDate.now().getMonth().getValue() + ";";
            Statement s = conn.createStatement();
            ResultSet resultados = s.executeQuery(sqlText);
            while(resultados.next()){
                pacientes.add(new Paciente(resultados.getInt("id"), resultados.getString("nome"), resultados.getString("cpf"), resultados.getTimestamp("nascimento").toLocalDateTime().toLocalDate(), resultados.getString("telefone")));
            }
        } catch (SQLException e){
            System.out.println("Erro de conexão!");
        }
        BD.end(conn);
        return pacientes;
    }

}
