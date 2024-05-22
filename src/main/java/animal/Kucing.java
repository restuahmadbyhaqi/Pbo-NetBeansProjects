/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author Lenovo
 */
class Kucing extends Animal {
    String jenisKucing;
    
    public Kucing (String makanan, String suara, String jenisKucing){
        super(makanan, suara);
        this.jenisKucing = jenisKucing;
        System.out.println("Terbentuk kucing" + jenisKucing);
    }
    
    void makan(){
        System.out.println("Kucing memakan " + this.makanan);
    }
    
    void bersuara(){
        System.out.println("Kucing suaranya " + this.suara);
    }
}
