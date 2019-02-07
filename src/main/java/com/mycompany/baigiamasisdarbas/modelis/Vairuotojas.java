/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.baigiamasisdarbas.modelis;

/**
 *
 * @author nijol
 */
public class Vairuotojas {

    private String vardas;
    private String pavarde;
    private double darboValandosSiMen;
    private double nuvaziuotiKm;
    private double sunaudotaKuroL;

    public Vairuotojas(String vardas, String pavarde, double darboValandosSiMen, double nuvaziuotiKm, double sunaudotaKuroL) {
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

    public double getDarboValandosSiMen() {
        return darboValandosSiMen;
    }

    public void setDarboValandosSiMen(double darboValandosSiMen) {
        this.darboValandosSiMen = darboValandosSiMen;
    }

    public double getNuvaziuotiKm() {
        return nuvaziuotiKm;
    }

    public void setNuvaziuotiKm(double nuvaziuotiKm) {
        this.nuvaziuotiKm = nuvaziuotiKm;
    }

    public double getSunaudotaKuroL() {
        return sunaudotaKuroL;
    }

    public void setSunaudotaKuroL(double sunaudotaKuroL) {
        this.sunaudotaKuroL = sunaudotaKuroL;
    }

}
