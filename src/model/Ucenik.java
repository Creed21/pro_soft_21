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
public class Ucenik {
    private int id;
    private int zavrsio_teor;
    private int zavrsio_prvu_pomoc;
    private int zavrsio_prakticni;
    private int polozio_prakticni;
    private int polozio_teor;
    private Date dt_polozio;
    private Korisnik korisnik;

    public Ucenik() {
    }

    
    public Ucenik(int zavrsio_teor, int zavrsio_prvu_pomoc, int zavrsio_prakticni, int polozio_prakticni, int polozio_teor, Date dt_polozio) {
        this.zavrsio_teor = zavrsio_teor;
        this.zavrsio_prvu_pomoc = zavrsio_prvu_pomoc;
        this.zavrsio_prakticni = zavrsio_prakticni;
        this.polozio_prakticni = polozio_prakticni;
        this.polozio_teor = polozio_teor;
        this.dt_polozio = dt_polozio;
    }
    
    public Ucenik(int id, int zavrsio_teor, int zavrsio_prvu_pomoc, int zavrsio_prakticni, int polozio_prakticni, int polozio_teor, Date dt_polozio) {
        this.id = id;
        this.zavrsio_teor = zavrsio_teor;
        this.zavrsio_prvu_pomoc = zavrsio_prvu_pomoc;
        this.zavrsio_prakticni = zavrsio_prakticni;
        this.polozio_prakticni = polozio_prakticni;
        this.polozio_teor = polozio_teor;
        this.dt_polozio = dt_polozio;
    }
    
    public Ucenik(int id, int zavrsio_teor, int zavrsio_prvu_pomoc, int zavrsio_prakticni, int polozio_prakticni, int polozio_teor, Date dt_polozio, Korisnik korisnik) {
        this.id = id;
        this.zavrsio_teor = zavrsio_teor;
        this.zavrsio_prvu_pomoc = zavrsio_prvu_pomoc;
        this.zavrsio_prakticni = zavrsio_prakticni;
        this.polozio_prakticni = polozio_prakticni;
        this.polozio_teor = polozio_teor;
        this.dt_polozio = dt_polozio;
        this.korisnik = korisnik;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getZavrsio_teor() {
        return zavrsio_teor;
    }

    public void setZavrsio_teor(int zavrsio_teor) {
        this.zavrsio_teor = zavrsio_teor;
    }

    public int getZavrsio_prvu_pomoc() {
        return zavrsio_prvu_pomoc;
    }

    public void setZavrsio_prvu_pomoc(int zavrsio_prvu_pomoc) {
        this.zavrsio_prvu_pomoc = zavrsio_prvu_pomoc;
    }

    public int getZavrsio_prakticni() {
        return zavrsio_prakticni;
    }

    public void setZavrsio_prakticni(int zavrsio_prakticni) {
        this.zavrsio_prakticni = zavrsio_prakticni;
    }

    public int getPolozio_prakticni() {
        return polozio_prakticni;
    }

    public void setPolozio_prakticni(int polozio_prakticni) {
        this.polozio_prakticni = polozio_prakticni;
    }

    public int getPolozio_teor() {
        return polozio_teor;
    }

    public void setPolozio_teor(int polozio_teor) {
        this.polozio_teor = polozio_teor;
    }

    public Date getDt_polozio() {
        return dt_polozio;
    }

    public void setDt_polozio(Date dt_polozio) {
        this.dt_polozio = dt_polozio;
    }

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }

    @Override
    public String toString() {
        return korisnik.toString() + "\n"+"zavrsio_teor: "+zavrsio_teor+", zavrsio_prvu_pomoc: "+zavrsio_prvu_pomoc
                +", zavrsio_prakticni: "+zavrsio_prakticni+", polozio_prakticni: "+polozio_prakticni
                +", polozio_teor: "+polozio_teor+"; datum kada je ucenik polozio voznju: "+ dt_polozio;
    }
    
}
