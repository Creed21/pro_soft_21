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
public class Grupa {
    private int id;
    private String naziv;
    private Date dtpoc;
    private String usc;
    private Date dtc;
    private String usm;
    private Date dtm;
    private Instruktor instruktor;
    private Kategorija kategorja;

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Grupa) {
            Grupa g = (Grupa) obj;
            if(this.id == g.id)
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return id+". "+naziv+ " "+kategorja.getNaziv()+" "+instruktor+" "+dtpoc+"\n"
                 +"kreirao "+usc+" "+dtc+"; modifikovao "+usm+" "+dtm;
    }
    
    public Grupa() {
    }

    public Grupa(String naziv, Date dtpoc, String usc, Date dtc, String usm, Date dtm) {
        this.naziv = naziv;
        this.dtpoc = dtpoc;
        this.usc = usc;
        this.dtc = dtc;
        this.usm = usm;
        this.dtm = dtm;
    }

    public Grupa(String naziv, Date dtpoc, String usc, Date dtc, String usm, Date dtm, Instruktor instruktor, Kategorija kategorja) {
        this.naziv = naziv;
        this.dtpoc = dtpoc;
        this.usc = usc;
        this.dtc = dtc;
        this.usm = usm;
        this.dtm = dtm;
        this.instruktor = instruktor;
        this.kategorja = kategorja;
    }

    public Grupa(int id, String naziv, Date dtpoc, String usc, Date dtc, String usm, Date dtm, Instruktor instruktor, Kategorija kategorja) {
        this.id = id;
        this.naziv = naziv;
        this.dtpoc = dtpoc;
        this.usc = usc;
        this.dtc = dtc;
        this.usm = usm;
        this.dtm = dtm;
        this.instruktor = instruktor;
        this.kategorja = kategorja;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Date getDtpoc() {
        return dtpoc;
    }

    public void setDtpoc(Date dtpoc) {
        this.dtpoc = dtpoc;
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

    public Instruktor getInstruktor() {
        return instruktor;
    }

    public void setInstruktor(Instruktor instruktor) {
        this.instruktor = instruktor;
    }

    public Kategorija getKategorja() {
        return kategorja;
    }

    public void setKategorja(Kategorija kategorja) {
        this.kategorja = kategorja;
    }
    
    
}
