/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel.management.system;
import java.sql.*;

/**
 *
 * @author Home-PC
 */
public class Conn {
    Connection c;
    Statement s;
    Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c =DriverManager.getConnection("jdbc:mysql://sql12.freesqldatabase.com:3306/sql12744611","sql12744611","HAI1wyypXJ");
            s=c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        new Conn();
    }
    
}
