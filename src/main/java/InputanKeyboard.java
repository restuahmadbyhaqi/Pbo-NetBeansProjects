/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class InputanKeyboard {
    public static void main (String args[]) {
        Scanner s = new Scanner(System.in);
        String nama;
        String alamat;
       
        System.out.print ("masukkan nama : ");
        nama = s.nextLine();
        
        System.out.print ("masukkan alamat : ");
        alamat = s.nextLine();
        
        System.out.println ("selamat datang " + nama + " dari " + alamat);
    }
}
