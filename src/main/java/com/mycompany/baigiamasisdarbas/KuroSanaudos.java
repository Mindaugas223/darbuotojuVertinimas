/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.baigiamasisdarbas;

// KS (kuro sanaudos 100km) = (V(ipilta kuro L) * 100) / S (nuvaziuotas kelias)
public class KuroSanaudos {
    
    public double naudotasKuras(double V, double S) {
        double ks = (V * 100) / S;
        return ks;
    }
}
