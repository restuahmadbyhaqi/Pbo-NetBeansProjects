/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hewan;

/**
 *
 * @author Lenovo
 */
public class Kucing extends Hewan implements Mamalia {
    private String ras;
    private String habitat;
    
        public Kucing (String ras, String habitat){
            this.ras = ras;
            this.habitat = habitat;
        }
        
        public String toString(){
            return "Kucing ras: " + ras + ", habitat: " + habitat;
        }
        
        public boolean equals(Object obj){
            if (obj instanceof Kucing) {
                Kucing other = (Kucing) obj;
                return this.ras.equals(other.ras);
            } else {
                return false;
            }
        }
        public Kucing (){
            System.out.println("construct Kucing");
        }
}
