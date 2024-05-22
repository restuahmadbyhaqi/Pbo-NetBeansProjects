/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author Lenovo
 */
public class AnimalTest {
    public static void main (String args []){
        Animal animal = new Animal("nasi", "hoemmm");
        animal.makan();
        animal.bersuara();
        
        Kucing anggora = new Kucing("ikan", "miuw..miaw", "anggora");
        anggora.makan();
        anggora.bersuara();
    }
}
