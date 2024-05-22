package Mobil;


import Mobil.Kendaraan;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Lenovo
 */
public class MainToyota {
    public static void main (String args []){
        Kendaraan avanza = new Kendaraan();
        avanza.merk = "Toyota Avanza";
        avanza.warna = "SILVER";
        avanza.harga = 180000000;
        avanza.Cc = 1800;
        avanza.jumlah = 7;
        
        System.out.println("Merk : " + avanza.merk);
        System.out.println("Warna : " + avanza.warna);
        System.out.println("Harga : " + avanza.harga);
        System.out.println("Cc : " + avanza.Cc);
        System.out.println("Jumlah : " + avanza.jumlah);
        
        System.out.println("=============");
        
        Kendaraan honda = new Kendaraan();
        honda.merk = "Honda Jazz";
        honda.warna = "MERAH";
        honda.harga = 250000000;
        honda.Cc = 1500;
        honda.jumlah = 5;
        
        System.out.println("Merk : " + honda.merk);
        System.out.println("Warna : " + honda.warna);
        System.out.println("Harga : " + honda.harga);
        System.out.println("Cc : " + honda.Cc);
        System.out.println("Jumlah : " + honda.jumlah);
    }
}
