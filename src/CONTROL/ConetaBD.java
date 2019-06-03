package CONTROL;
import java.sql.*;
import javax.swing.JOptionPane;

public class ConetaBD {
    // classe para fazer a conexão com o BD
    public static Connection conetcabd() throws ClassNotFoundException {
     
        try{
            //Chama a classe do driver do postgres.
            Class.forName("org.postgresql.Driver");
            // objeto que faz a conexão com o BD. ficar atento a connfiguração dos parametros de entrada.
            Connection con =  DriverManager.getConnection("jdbc:postgresql://localhost:5432/crud", "postgres", "Postgre@123");
            JOptionPane.showMessageDialog(null, "Entrou, Babaca!");
            return con;
        }catch(SQLException error){
            JOptionPane.showMessageDialog(null, error);
            return null;
            
        }
    }
    
}
