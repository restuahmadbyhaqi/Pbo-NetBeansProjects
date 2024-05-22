/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Lenovo
 */
public class ContohSwitchCase {
    public static void main(String args[]) {
        
        char grade = 'C';
        
        switch(grade) {
            case 'A' :
                System.out.println("perfect!");
                break;
            case 'B' :
                System.out.println("Excelent");
                break;
            case 'C' :
                System.out.println("Well done");
                break;
            case 'D' :
                System.out.println("You passed");
                break;
            case 'F':
                System.out.println("Better try again");
                break;
            default :
                System.out.println("Invailed grade");
        }
        System.out.println("your grade is " + grade);
    }
}
