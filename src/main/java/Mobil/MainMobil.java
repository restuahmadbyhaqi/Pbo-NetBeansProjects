package Mobil;


import Mobil.Mobil;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class MainMobil {
    public static void main (String args []){
        Mobil avanza = new Mobil();
        avanza.maju();
        avanza.mundur();
        avanza.belok();
        
        System.out.println("Mesin" + avanza.mesin);
        System.out.println("Roda" + avanza.roda);
        System.out.println("Body" + avanza.body);
    }
}
