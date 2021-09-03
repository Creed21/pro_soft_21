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
public class Korisnik {
    protected int id;
    private String ime;
    private String prezime;
    private String email;
    private String jmbg;
    private String telefon;
    private Date datrodj;
    private String usc;
    private Date dtc;
    private String usm;
    private Date dtm;

    public Korisnik() {
    }

    public Korisnik(String ime, String prezime, String email, String jmbg, String telefon, Date datrodj, String usc, Date dtc, String usm, Date date) {
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
        this.jmbg = jmbg;
        this.telefon = telefon;
        this.datrodj = datrodj;
        this.usc = usc;
        this.dtc = dtc;
        this.usm = usm;
        this.dtm = date;
    }

    public Korisnik(int id, String ime, String prezime, String email, String jmbg, String telefon, Date datrodj, String usc, Date dtc, String usm, Date date) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
        this.jmbg = jmbg;
        this.telefon = telefon;
        this.datrodj = datrodj;
        this.usc = usc;
        this.dtc = dtc;
        this.usm = usm;
        this.dtm = date;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Korisnik) {
            Korisnik k = (Korisnik) obj;
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

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public Date getDatrodj() {
        return datrodj;
    }

    public void setDatrodj(Date datrodj) {
        this.datrodj = datrodj;
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

    public Date getDate() {
        return dtm;
    }

    public void setDate(Date date) {
        this.dtm = date;
    }

    @Override
    public String toString() {
        return id+". "+ime+" "+prezime+" "+email+" "+telefon+"\n kreirao "+usc+" "+dtc+"; modifikovao "+usm+" "+dtm;
    }
    
}
