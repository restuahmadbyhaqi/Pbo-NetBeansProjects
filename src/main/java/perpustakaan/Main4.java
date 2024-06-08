/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lathian_pbo2_7;
import java.sql.*;
/**
 *
 * @author Lenovo
 */
public class Main4 {
    public static void main(String[] args){
        try{
            Connection conn = 
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/perpustakaan","root","");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from buku");
            while(rs.next()){
                System.out.println(rs.getString("judul"));
                System.out.println(rs.getString("pengarang"));
                System.out.println(rs.getString("penerbit"));
            }
            stmt.close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
}
