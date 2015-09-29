/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking.modules;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author benson
 */
public class MysqlConnect {
    
    Conection conn = null;
    Public static Connection ConnectDB(){
        try{
            class.forName("com.mysql.jdbc.driver");
                    Connection conn = DriverManager.getConnection("jdbc://mysql://localhost/fms", "root", "master12!");
                    JOptionPane.showMessageDialog(null, "cannecton Established")
                    return conn;
        }
            catch(Exception e){
                   JOptionPane.showMessageDialog(null,e)
                           return null;
                    }
    }
}
