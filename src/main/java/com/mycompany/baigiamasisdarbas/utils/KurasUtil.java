/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.baigiamasisdarbas.utils;

// KS (kuro sanaudos 100km) = (V(ipilta kuro L) * 100) / S (nuvaziuotas kelias)
public class KurasUtil {
    
    public static double naudotasKuras(double v, double s) {
        return (v * 100) / s;
    }
}
