package services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BD {

    public static Connection connect(){
        String url = "jdbc:mysql://localhost:3306/clinicadentaria";
        String user = "root";
        String pass = "";

        try {
            Connection conn = DriverManager.getConnection(url, user, pass);
            return conn;
        } catch (SQLException e) {
            System.err.println("Falha na conexão...");
            return null;
        }

    }

    public static void end(Connection conn){
        try{
            conn.close();
        } catch (SQLException e){
            System.out.println("Falha na conexão..");
        } catch (Exception e){
            System.out.println("Erro desconhecido...");
        }

    }

}
