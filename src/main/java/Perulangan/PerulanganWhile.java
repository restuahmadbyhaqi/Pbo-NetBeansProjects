package Perulangan;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class PerulanganWhile {
    public static void main(String[] args) {
        int nilai = 1;
        while (nilai <= 10) {
            System.out.print("Angka : " + nilai);
            nilai++;
            System.out.print("\n");
        }
        int no = 7;
        do {
            System.out.println("Mahasiswa : " + no);
            no++;
        } while (no <= 5);
    }
}
