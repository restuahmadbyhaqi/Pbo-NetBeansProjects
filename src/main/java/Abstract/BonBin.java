/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

/**
 *
 * @author Lenovo
 */
public class BonBin {
    static void test(Binatang x){
        x.makan();
        x.tidur();
    }
    
    public static void main(String[] agrs){
        Binatang g = new Gajah() {};
        Binatang k = new Kerbau() {};
        test(g);
        test(k);
    }
}
