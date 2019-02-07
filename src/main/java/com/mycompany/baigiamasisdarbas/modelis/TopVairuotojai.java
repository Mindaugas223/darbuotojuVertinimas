/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.baigiamasisdarbas.modelis;

import java.util.Comparator;

/**
 *
 * @author nijol
 */
public class TopVairuotojai implements Comparator<Vairuotojas> {

    public TopVairuotojai(double valSvoris, double kmSvoris, double sanauduSvoris){
        
    }
    
    @Override
    public int compare(Vairuotojas o1, Vairuotojas o2) {

        return 0;
    }

    /**
     * <pre>
     *valandos
     *
     *V = 164 / (164 + abs(164 - val))
     *
     * [0..1]
     * </pre>
     *
     */
    
     /**
     * <pre>
     *kilometrai
     *Rasti daugiausia nuvaziavusi ir ji prilyginti 1;
     *O tas, kuris nuvaziavo 0, gaus 0 ivertinima.
     *
     * KM = ...
     * 
     * [0..1]
     * </pre>
     *
     */
    
     /**
     * <pre>
     *kuras
     *
     * 
     * K = ...
     *
     * rasti geriausia santyki ir ji prilyginti vienetui, o kiti paskui lyginami procentaliai su jais.
     * 
     * </pre>
     *
     */
    
    
     /**
     * <pre>
     *bendras
     * 
     * 
     *
     *
     * (V + dV) * (KM + dKM) * (K + dK) = bendr
     * 
     * 
     * </pre>
     *
     */
}
