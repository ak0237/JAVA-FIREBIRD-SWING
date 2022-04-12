
package javaapplication1;

import java.sql.Statement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.DriverManager;

public class JavaApplication1 {


    public static void main(String[] args) {
        try{
            Connection conexao;
            Class.forName("org.firebirdsql.jdbc.FBDriver");
            conexao = DriverManager.getConnection(
                "jdbc:firebirdsql://localhost:3050/C:\\EXEMPLOJDBC.fdb", "SYSDBA", "123456");
            Statement st = conexao.createStatement();
            
            st.executeUpdate("INSERT INTO CLIENTE VALUES (2, 'MARIA', 'maringa')");
            
        }catch(ClassNotFoundException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro no driver");
        }catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados");
        }
    }
    
}
