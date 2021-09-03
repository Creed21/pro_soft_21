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
public class PrakticniCas {
    private int rbr;
    private Instruktor instruktor;
    private Ucenik ucenik;
    private String naziv;
    private Date odrzan;
    private String usc;
    private Date dtc;

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof PrakticniCas) {
            PrakticniCas pc = (PrakticniCas) obj;
            if(rbr == pc.rbr && instruktor.equals(pc.instruktor) && ucenik.equals(pc.ucenik))
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return rbr+". "+naziv+" instr: "+instruktor.getUsername()
                +", ucenik: "+ucenik.getKorisnik().getIme()+" "+ucenik.getKorisnik().getPrezime()+"; "+odrzan;
    }
    
    public PrakticniCas() {
    }

    public PrakticniCas(Instruktor instruktor, Ucenik ucenik, String naziv, Date odrzan, String usc, Date dtc) {
        this.instruktor = instruktor;
        this.ucenik = ucenik;
        this.naziv = naziv;
        this.odrzan = odrzan;
        this.usc = usc;
        this.dtc = dtc;
    }

    public PrakticniCas(int rbr, Instruktor instruktor, Ucenik ucenik, String naziv, Date odrzan, String usc, Date dtc) {
        this.rbr = rbr;
        this.instruktor = instruktor;
        this.ucenik = ucenik;
        this.naziv = naziv;
        this.odrzan = odrzan;
        this.usc = usc;
        this.dtc = dtc;
    }

    public int getRbr() {
        return rbr;
    }

    public void setRbr(int rbr) {
        this.rbr = rbr;
    }

    public Instruktor getInstruktor() {
        return instruktor;
    }

    public void setInstruktor(Instruktor instruktor) {
        this.instruktor = instruktor;
    }

    public Ucenik getUcenik() {
        return ucenik;
    }

    public void setUcenik(Ucenik ucenik) {
        this.ucenik = ucenik;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Date getOdrzan() {
        return odrzan;
    }

    public void setOdrzan(Date odrzan) {
        this.odrzan = odrzan;
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
    
}
