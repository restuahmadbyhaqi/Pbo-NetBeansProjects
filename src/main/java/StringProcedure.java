/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class StringProcedure {
    public static void main (String args []){
        String st1 = "Universitas";
        String st2 = "Muhammadiyah";
        String st3 = "Magelang";
        String st4 = "UNIMMA";
        String st5 = st1 +
                st2 + st3 + st4;
        
        System.out.println("Statement 1 " + st1);
        System.out.println("Statement 2 " + st2);
        System.out.println("Statement 3 " + st3);
        System.out.println("Statement 4 " + st5);
        
        System.out.println("st1 == st2 :" + (st1 == st2));
        System.out.println("st1 != st2 :" + (st1 != st2));
        
        System.out.println("Statement.equal(statement2) :" + st1.equals(st2));
        
        System.out.println (st1.compareTo(st2));
        
        System.out.println (st1.length());
        
        System.out.println (st4.toLowerCase());
        
        System.out.println (st1.toUpperCase());
    }
}
