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
public class Kategorija {
    private int id;
    private String naziv;
    private int min_god; 
    private String usc;
    private Date dtc;
    private String usm;
    private Date dtm;

    public Kategorija() {
    }

    public Kategorija(String naziv, int min_god, String usc, Date dtc, String usm, Date dtm) {
        this.naziv = naziv;
        this.min_god = min_god;
        this.usc = usc;
        this.dtc = dtc;
        this.usm = usm;
        this.dtm = dtm;
    }

    public Kategorija(int id, String naziv, int min_god, String usc, Date dtc, String usm, Date dtm) {
        this.id = id;
        this.naziv = naziv;
        this.min_god = min_god;
        this.usc = usc;
        this.dtc = dtc;
        this.usm = usm;
        this.dtm = dtm;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Kategorija) {
            Kategorija k = (Kategorija) obj;
            if(this.id == k.id) 
                return true;
        }
        return false;
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

    public int getMin_god() {
        return min_god;
    }

    public void setMin_god(int min_god) {
        this.min_god = min_god;
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

    @Override
    public String toString() {
        return id+". "+naziv+", minimalan broj godina za upis kategorje: "+min_god+"\n"
                +"kreirao: "+usc+" "+dtc+"; modifikovao: "+usm+" "+dtm;
    }
}
