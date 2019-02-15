/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.baigiamasisdarbas;




import com.mycompany.baigiamasisdarbas.comparators.TopVairuotojai;
import com.mycompany.baigiamasisdarbas.duomenys.LaikiniDuomenys;
import com.mycompany.baigiamasisdarbas.modelis.Vairuotojas;
import java.util.Collections;



/**
 *
 * @author nijol
 */
public class MainApp{
    
    
    public static void main(String[] args) {
        
        
        LaikiniDuomenys ld = new LaikiniDuomenys();
        
        Collections.sort(ld.gautiVairuotojus(), new TopVairuotojai(0, 0, 0, ld.gautiVairuotojus()));
        
        for (Vairuotojas v : ld.gautiVairuotojus()) {
            
            System.out.println(v);
            
        }
        
       // System.out.println(ld.gautiVairuotojus().toString());
        
    }
}
