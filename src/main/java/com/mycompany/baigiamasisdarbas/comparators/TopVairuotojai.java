/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.baigiamasisdarbas.comparators;

import com.mycompany.baigiamasisdarbas.duomenys.NaudingumoSkaic;
import com.mycompany.baigiamasisdarbas.modelis.Vairuotojas;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author nijol
 */
public class TopVairuotojai implements Comparator<Vairuotojas> {

    
    private List<Vairuotojas> vairuotojai = null;
    private NaudingumoSkaic skaiciuotuvas = null;
    
//    private int order;
//    public TopVairuotojai(boolean order){
//        this.order = (order ? 1 : 1);
//    }
    
    public TopVairuotojai(double dV, double dKM, double dK, List<Vairuotojas> vairuotojai){
        skaiciuotuvas = new NaudingumoSkaic(dV, dKM, dK);
        
        this.vairuotojai = vairuotojai;
    }
    
    @Override
    public int compare(Vairuotojas o1, Vairuotojas o2) {

        return Double.compare(skaiciuotuvas.skaiciuok(o1, vairuotojai), skaiciuotuvas.skaiciuok(o2, vairuotojai)) * -1; //arba bandyt rasyti "order" ir pasiaiskinti
    }   
    @Override
    public String toString() {
        return " " + vairuotojai;
    }
}
