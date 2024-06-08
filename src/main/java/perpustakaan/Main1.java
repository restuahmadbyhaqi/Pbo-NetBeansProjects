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
public class Main1 {
    public static void main(String[] args){
        try{
            Connection conn = 
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/perpustakaan","root","");
            Statement stmt = conn.createStatement();
            stmt.execute("insert into buku(judul,pengarang,penerbit,issbn,jumlah_salinan,ringkasan) values"
            + "('Mengejar Harapan', 'Buid','Jogjakarta',1121,100, 'buku motivasi')");
            stmt.close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
}
