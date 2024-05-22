package pesawat;


import pesawat.PesawatTempur;
import pesawat.Pesawat;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class MainPesawat {
    public static void main (String args[]){
        Pesawat boeing = new Pesawat();
        PesawatTempur f16 = new PesawatTempur();
        
        boeing.terbang();
        f16.terbang();
        
        boeing.mendarat();
        f16.mendarat();
        
//        boeing.manuver();
        f16.manuver();
    }
}
