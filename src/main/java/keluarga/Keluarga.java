/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package keluarga;
/**
 *
 * @author user
 */
public class Keluarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Manusia bapak = new Orang_Tua("Achmad Esnada Mustaqim", "Magelang", "06 February 1978", "Karyawan Swasta", "Ngluwar,Magelang", "085212190391", 0);
        Manusia ibu = new Orang_Tua("Nurwati", "Jakarta", "10 December 1983", "Ibu Rumah tangga", "Ngluwar,Magelang", "085879112500", 0);
        Manusia rizqi = new Anak("Ravanelly Rizqi Pratama", "Jakarta", "07 May 2004", "Pelajar/Mahasiswa", "Ngluwar,Magelang", "081392101010", 0);
        Manusia aufar = new Anak("Aufar Pradipta Evanizar", "Jakarta", "26 February 2014", "Pelajar", "Ngluwar,Magelang", "0", 0);
       
        System.out.println(bapak.getDetails());
        System.out.println(ibu.getDetails());
        System.out.println(rizqi.getDetails());
        System.out.println(aufar.getDetails());
    }
    
       
    }
