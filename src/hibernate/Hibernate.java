/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;
import java.sql.*;
/**
 *
 * @author AEVN
 */
public class Hibernate {
    private static final String USERNAME="root";
    private static final String PASSWORD="22121998khoi";
    private static final String CONN_STRING="jdbc:mysql://localhost:3306/hibernate_java_db";
    
    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            System.out.println("connected!");
            Statement stmt = (Statement) conn.createStatement();
            String insert = "INSERT INTO student " + "VALUES (1612307, 'Nguyễn Văn Tường Khôi', 'Nam', '026043440', '17HBH')";
            stmt.executeUpdate(insert);
        } catch (SQLException e){
            System.err.println(e);
        }
    }
    
}
