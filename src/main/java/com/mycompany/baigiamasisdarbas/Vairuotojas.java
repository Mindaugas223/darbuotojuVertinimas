/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.baigiamasisdarbas;

/**
 *
 * @author nijol
 */
public class Vairuotojas {
    
    private String vardas;
    private String pavarde;
    private Double darboValandosSiMen;
    private Double nuvaziuotiKm;
    private Double sunaudotaKuroL;

        public Vairuotojas(String vardas, String pavarde, Double darboValandosSiMen, Double nuvaziuotiKm, Double sunaudotaKuroL) {
            super();
            this.vardas = vardas;
            this.pavarde = pavarde;
            this.darboValandosSiMen = darboValandosSiMen;
            this.nuvaziuotiKm = nuvaziuotiKm;
            this.sunaudotaKuroL = sunaudotaKuroL;
            
        }
    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public Double getDarboValandosSiMen() {
        return darboValandosSiMen;
    }

    public void setDarboValandosSiMen(Double darboValandosSiMen) {
        this.darboValandosSiMen = darboValandosSiMen;
    }

    public Double getNuvaziuotiKm() {
        return nuvaziuotiKm;
    }

    public void setNuvaziuotiKm(Double nuvaziuotiKm) {
        this.nuvaziuotiKm = nuvaziuotiKm;
    }

    public Double getSunaudotaKuroL() {
        return sunaudotaKuroL;
    }

    public void setSunaudotaKuroL(Double sunaudotaKuroL) {
        this.sunaudotaKuroL = sunaudotaKuroL;
    }
    
}
