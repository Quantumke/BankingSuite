/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking.modules;
import java.sql.*;
import javax.swing.*;
import java.sql.DriverManager;

/**
 *
 * @author benson
 */
public class MysqlConnect {
    Connection conn = null;
             String url = "jdbc:mysql://localhost:3306/fms";
             String dbName = "fms";
             String driver = "com.mysql.jdbc.Driver"; //MYSQL Driver/connector added to libary.
             String userName = "root"; //username to DB
             String password = "master12!"; //password to DB (blank)
             Statement st;
             ResultSet rs;

             //method that connects with conditional functions
    public  static Connection ConnectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/fms","root","master12!");
            System.out.println("Connection with Database Established");
            
            return conn;

    }
        //Exception is an error handling message that informs the user that connection wasn't successful
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Connection to the database has not been established successsfully." + e.getMessage());
            System.out.println("Error:"+e);
            return null;
        }}}
             

    