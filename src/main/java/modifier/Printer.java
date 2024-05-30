/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modifier;

/**
 *
 * @author ASUS
 * 
 */
public class Printer {
//    private void print(String s){
//    protected void print(String s){
    public void print(String s){
        System.out.println(s);
    }
    public void callPrint(){
        //akses dari dalam class
        print("test");
    }
}
