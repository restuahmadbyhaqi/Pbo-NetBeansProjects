package Mahasiswa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Mahasiswa {
    String nama;
    String npm;
    int umur;
    
    
    public Mahasiswa (String namaMahasiswa, String kodeNPM, int umurMahasiswa){
        nama = namaMahasiswa;
        npm = kodeNPM;
        umur = umurMahasiswa;
    }
    
    public void MainMahasiswa() {
        System.out.println("Nama: " + nama);
        System.out.println("NPM: " + npm);
        System.out.println("Umur: " + umur);
    }
}
