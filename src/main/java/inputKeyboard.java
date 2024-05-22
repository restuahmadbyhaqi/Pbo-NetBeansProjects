import java.util.Scanner;

public class inputKeyboard {
    public static void main (String args[]) {
        Scanner s = new Scanner(System.in);
        String nama;
        String alamat;
       
        System.out.print ("masukkan nama : ");
        nama = s.nextLine();
        
        System.out.print ("masukkan alamat : ");
        alamat = s.nextLine();
        
        System.out.println ("selamat datang" + nama + "dari" + alamat);
    }
}
