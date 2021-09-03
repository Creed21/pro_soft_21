/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
/**
 *
 * @author Filip
 */
public class TeorijskiCas {
    private int rbr_teor_cas;
    private Instruktor instruktor;
    private Grupa grupa;
    private Date dt;
    private String tema;
    private String usc;
    private Date dtc;
    private String usm;
    private Date dtm;

    public TeorijskiCas() {
    }

    @Override
    public String toString() {
        return "TeorijskiCas{" + "rbr_teor_cas=" + rbr_teor_cas + ", instruktor=" + instruktor + ", grupa=" + grupa + ", dt=" + dt + ", tema=" + tema + ", usc=" + usc + ", dtc=" + dtc + ", usm=" + usm + ", dtm=" + dtm + '}';
    }

    public TeorijskiCas(Instruktor instruktor, Grupa grupa, Date dt, String tema, String usc, Date dtc, String usm, Date dtm) {
        this.instruktor = instruktor;
        this.grupa = grupa;
        this.dt = dt;
        this.tema = tema;
        this.usc = usc;
        this.dtc = dtc;
        this.usm = usm;
        this.dtm = dtm;
    }

    public TeorijskiCas(int rbr_teor_cas, Instruktor instruktor, Grupa grupa, Date dt, String tema, String usc, Date dtc, String usm, Date dtm) {
        this.rbr_teor_cas = rbr_teor_cas;
        this.instruktor = instruktor;
        this.grupa = grupa;
        this.dt = dt;
        this.tema = tema;
        this.usc = usc;
        this.dtc = dtc;
        this.usm = usm;
        this.dtm = dtm;
    }

    public int getRbr_teor_cas() {
        return rbr_teor_cas;
    }

    public void setRbr_teor_cas(int rbr_teor_cas) {
        this.rbr_teor_cas = rbr_teor_cas;
    }

    public Instruktor getInstruktor() {
        return instruktor;
    }

    public void setInstruktor(Instruktor instruktor) {
        this.instruktor = instruktor;
    }

    public Grupa getGrupa() {
        return grupa;
    }

    public void setGrupa(Grupa grupa) {
        this.grupa = grupa;
    }

    public Date getDt() {
        return dt;
    }

    public void setDt(Date dt) {
        this.dt = dt;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getUsc() {
        return usc;
    }

    public void setUsc(String usc) {
        this.usc = usc;
    }

    public Date getDtc() {
        return dtc;
    }

    public void setDtc(Date dtc) {
        this.dtc = dtc;
    }

    public String getUsm() {
        return usm;
    }

    public void setUsm(String usm) {
        this.usm = usm;
    }

    public Date getDtm() {
        return dtm;
    }

    public void setDtm(Date dtm) {
        this.dtm = dtm;
    }
    
    
}
