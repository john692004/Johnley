/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stimulating_system_security;

/**
 *
 * @author johnley
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db_conn {
    public static Connection con(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/simulating_system_security";
            String user = "root";
            String pass="";
            Connection con = DriverManager.getConnection(url, user, pass);
            return con;
        }catch (SQLException e){
            System.out.println(e);
        }
        catch (ClassNotFoundException e){
            System.out.println(e);
        }
        return null;
    }       
}