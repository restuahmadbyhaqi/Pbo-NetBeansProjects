/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author Lenovo
 */
public class LuasBangunDatar {
    public static void main(String[] args) {
        SegiTiga segitiga = new SegiTiga(12, 50);
        PersegiPanjang persegipanjang = new PersegiPanjang(20, 30);
        System.out.println("luas segitiga dengan alas 12 dan tinggi 50 = " +segitiga.hitungLuas());
        System.out.println("luas persegi panjang dengan panjang 20 dan leabar 30 = " +persegipanjang.hitungLuas());
    }
}
