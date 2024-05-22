


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
        
        Manusia bapak = new Orang_Tua("samin hermanto", "bekasi", "24 March 2003", "petani", "bekasi", "085640997282", 0);
        Manusia ibu = new Orang_Tua("Laelatul Nikmah", "Magelang", "24 March 2003", "Ibu Rumah tangga", "bekasi", "085640997282", 0);
        Manusia anak = new Anak("Restu ahmad byhaqi", "Magelang", "24 March 2003", "Mahasiswa", "Windusari,Magelang", "085640997282", 0);
       
        System.out.println(bapak.getDetails());
        System.out.println(ibu.getDetails());
        System.out.println(anak.getDetails());
    }
    
       
    }

