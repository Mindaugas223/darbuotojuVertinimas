/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.baigiamasisdarbas.comparators;

import com.mycompany.baigiamasisdarbas.modelis.Vairuotojas;
import java.util.Comparator;

/**
 *
 * @author nijol
 */
public class KurasComp implements Comparator<Vairuotojas> {
    
    @Override
    public int compare(Vairuotojas v1, Vairuotojas v2) {
        return Double.compare(v2.getSunaudotaKuroL(), v1.getSunaudotaKuroL());
    }
    
}
