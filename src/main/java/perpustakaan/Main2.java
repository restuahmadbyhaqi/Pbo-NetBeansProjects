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
public class Main2 {
    public static void main(String[] args){
        try{
            Connection conn = 
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/perpustakaan","root","");
            Statement stmt = conn.createStatement();
            stmt.execute("update buku set issbn='134-154-556',"
            + "jumlah_salinan = 10, ringkasan='ini buku baru' where id_buku = 1");
            stmt.close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
}
