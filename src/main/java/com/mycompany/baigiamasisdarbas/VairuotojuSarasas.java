/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.baigiamasisdarbas;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author nijol
 */
public class VairuotojuSarasas {
    
    public List<Vairuotojas> gautiDuomenis() {
        List<Vairuotojas> duomenys = new ArrayList<Vairuotojas>();
        duomenys.add(new Vairuotojas("Petras", "Gendolfinis", 164.0, 13465.2, 3500.0));
        duomenys.add(new Vairuotojas("Jonas", "Kapitalizmas", 143.0, 11211.7, 3101.6));
        duomenys.add(new Vairuotojas("Kazys", "Kiaušspyris", 171.1, 14113.2, 3842.4));
        duomenys.add(new Vairuotojas("Steponas", "Užvairis", 160.0, 13000.1, 3434.7));
        duomenys.add(new Vairuotojas("Balys", "Skirtumas", 155.5, 12124.4, 3313.2));
        duomenys.add(new Vairuotojas("Markas", "Žalgiris", 136.0, 10401.5, 2845.1));
        duomenys.add(new Vairuotojas("Mindaugas", "Tribitas", 172.3, 19788.3, 4752.5));
        duomenys.add(new Vairuotojas("Ona", "Kukulienė", 167.5, 15366.9, 4125.8));
        duomenys.add(new Vairuotojas("Alisa", "Pergalė", 100.0, 8542.8, 2164.5));
        duomenys.add(new Vairuotojas("Norbertas", "Žvejys", 169.5, 16458.1, 3993.4));
        return duomenys;
        
        //pasidaryti, kad is cia kazkaip butu panaudota info i KuroSanaudos klase
    }
}
