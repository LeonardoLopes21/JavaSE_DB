package controller;

import models.Medico;
import services.BD;

import java.sql.*;
import java.util.ArrayList;

public class MedicoController {

    public static void registerMedico(Medico m){

        Connection conn = BD.connect();

        String sqlText = "INSERT INTO medicos(nome, especialidade, cro) VALUES(?,?,?)";
        try {
            PreparedStatement statement = conn.prepareStatement(sqlText);
            statement.setString(1, m.getNome());
            statement.setString(2, m.getEspecialidade());
            statement.setString(3, m.getCro());
            if(statement.executeUpdate() > 0){
                System.out.println("Médico Cadastrado!");
            }
        } catch (SQLException e) {
            System.out.println("ERRO SQL" + e);
        } catch (Exception e){
            System.out.println("Erro desconhecido!" + e);
        }

        BD.end(conn);

    }

    public static void printMedico(Medico m){
        System.out.println("========================================");
        System.out.println("ID: " + m.getId());
        System.out.println("Nome: " + m.getNome());
        System.out.println("CRO: " + m.getCro());
        System.out.println("Especialidade: " + m.getEspecialidade());
        System.out.println("========================================");
    }

    public static ArrayList<Medico> getAllMedicos(){
        Connection conn = BD.connect();
        ArrayList medicos = new ArrayList<Medico>();
        try{
            String sqlText = "SELECT * FROM medicos";
            Statement s = conn.createStatement();
            ResultSet resultados = s.executeQuery(sqlText);
            while(resultados.next()){
                medicos.add(new Medico(resultados.getString("nome"), resultados.getString("especialidade"), resultados.getString("cro"), resultados.getInt("id")));
            }
        } catch (SQLException e){
            System.out.println("Erro de conexão!");
        }
        BD.end(conn);
        return medicos;
    }

    public static ArrayList<Medico> getAllMedicosBySpecialty(String specialty){
        Connection conn = BD.connect();
        ArrayList<Medico> medicos = MedicoController.getAllMedicos();
        ArrayList<Medico> a = new ArrayList<Medico>();
        
        for(Medico m : medicos){
            if(m.getEspecialidade().equals(specialty)){
                a.add(m);
            }
        }
        
        
        return a;
    }

    public static Medico findMedicsByName(String nome){
        
        ArrayList<Medico> all = MedicoController.getAllMedicos();
        
        Medico medic = new Medico();

        for(Medico m : all){
            if(m.getNome().equals(nome)){
                medic = m;
            }
        }

        return medic;
    }

}
