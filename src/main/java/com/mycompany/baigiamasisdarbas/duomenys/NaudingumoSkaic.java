/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.baigiamasisdarbas.duomenys;

import com.mycompany.baigiamasisdarbas.modelis.Vairuotojas;
import com.mycompany.baigiamasisdarbas.utils.KurasUtil;
import java.util.Collections;
import java.util.List;

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
public class NaudingumoSkaic {

    double dV;
    double dKM;
    double dK;

    public NaudingumoSkaic(double dV, double dKM, double dK) {
        this.dV = dV;
        this.dKM = dKM;
        this.dK = dK;
    }
    
    
    
    
    public double skaiciuok(Vairuotojas v, List<Vairuotojas> vairuotojai){
        return (valanduDedamoji(v) + dV) * (kelioDedamoji(v, vairuotojai) + dKM) * (kuroDedamoji(v, vairuotojai) + dK);
    }
    
    // *V = 164 / (164 + abs(164 - val))
    private double valanduDedamoji(Vairuotojas v) {
        return 164 / (164 + Math.abs(164 - v.getDarboValandosSiMen()));
    }
    private double kelioDedamoji(Vairuotojas v, List<Vairuotojas> vairuotojai) {
        
        double max = 0;
        for (Vairuotojas vair : vairuotojai){
           if ( vair.getNuvaziuotiKm() > max){
               max = vair.getNuvaziuotiKm();
           }
            
        }
        return v.getNuvaziuotiKm() / max;
    }
    private double kuroDedamoji(Vairuotojas v,List<Vairuotojas> vairuotojai) {
        double max = 0;
        for (Vairuotojas vair : vairuotojai){
           if ( (vair.getNuvaziuotiKm()/ vair.getSunaudotaKuroL()) > max){
               max = (vair.getNuvaziuotiKm()/ vair.getSunaudotaKuroL());
           }
            
        }
        return (v.getNuvaziuotiKm()/ v.getSunaudotaKuroL()) / max;
    }
    
}
