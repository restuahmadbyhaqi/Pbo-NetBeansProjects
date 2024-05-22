/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Hewan;

/**
 *
 * @author Lenovo
 */
interface Main {
    public static void main(String[] args) {
        Hewan hewan = new Hewan();
        System.out.println("Apakah hewan IS-A Objek --> " + (hewan instanceof Object));
        System.out.println("Apakah hewan IS-A Hewan --> " + (hewan instanceof Hewan));
        System.out.println("Apakah hewan IS-A Kucing --> " + (hewan instanceof Kucing));
        
        System.out.println("---------------------------");
        
        Kucing kucing = new Kucing();
        System.out.println("Apakah hewan IS-A Object --> " + (hewan instanceof Object));
        System.out.println("Apakah hewan IS-A Hewan --> " + (hewan instanceof Hewan));
        System.out.println("Apakah hewan IS-A Kucing --> " + (hewan instanceof Kucing));
        
        System.out.println("---------------------------");
        
        hewan.makan();
        kucing.makan();
        kucing.makan("daging ikan");
        
        Kucing meow = new Kucing("Ocicast", "Tropis");
        Kucing puss = new Kucing("Ocicast", "subtropis");
        Kucing popo = new Kucing("Anggora", "subtropis");
        
        System.out.println(meow.toString());
        System.out.println(puss.toString());
        System.out.println(popo.toString());
        
        System.out.println("meow equals ? " + meow.equals(puss));
        System.out.println("meow equals ? " + meow.equals(popo));
        
        System.out.println("---------------------------");
        
        Object o = new Kucing();
        Hewan h = new Kucing();
        Kucing k = new Kucing();
        
        h.makan();
        k.makan();
        
        Object object = k;
        Hewan hewanK = k;
        
        Kucing kucingK = (Kucing) h;
        kucingK.makan();
        
        Hewan harimau = new Hewan();
        Kucing anggora = (Kucing) harimau;
        
    }  
}
