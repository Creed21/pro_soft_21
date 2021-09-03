/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Filip
 */
public class Instruktor extends GenericObject {
    private int id;
    private String username;
    private String pass;
    private double plata;
    private Date datzap;
    private Korisnik korisnik;

    public Instruktor(String username, String pass) {
        this.username = username;
        this.pass = pass;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Instruktor) {
            Instruktor i = (Instruktor) obj;
            if(this.id == i.id)
                return true;
        }
        return false;
    }
    
    public Instruktor() {
    }

    public Instruktor(String username, String pass, double plata, Date datzap) {
        this.username = username;
        this.pass = pass;
        this.plata = plata;
        this.datzap = datzap;
    }
    
    public Instruktor(int id, String username, String pass, double plata, Date datzap) {
        this.id = id;
        this.username = username;
        this.pass = pass;
        this.plata = plata;
        this.datzap = datzap;
    }
    
    public Instruktor(int id, String username, String pass, double plata, Date datzap, Korisnik korisnik) {
        this.id = id;
        this.username = username;
        this.pass = pass;
        this.plata = plata;
        this.datzap = datzap;
        this.korisnik = korisnik;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public double getPlata() {
        return plata;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }

    public Date getDatzap() {
        return datzap;
    }

    public void setDatzap(Date datzap) {
        this.datzap = datzap;
    }

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }

    @Override
    public String toString() {
//        return "Instruktor: "+korisnik != null ? korisnik.toString(): ""+"\n"
        return "Instruktor: "
                +"username: "+username+", pass: "+pass
                +", plata: " + plata + "; datum zaposenja: "+(datzap != null ? datzap.toString() : "");
    }

    @Override
    public String getColumnNames() {
        return "id, username, pass, plata, datzap";
    }

    @Override
    public String getcolumnValues() {
        return id+", "+username+", "+pass+", "+plata+", "+datzap;
    }

    @Override
    public String makeWherePrimKey() {
        return " and id = "+id;
    }

    @Override
    public String getClassName() {
        return "instruktor";
    }

    @Override
    public String getPrimaryKey() {
        return "id";
    }

    @Override
    public String getMessage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GenericObject findRecords(GenericObject genObj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String makeLoginQuery() {
        return super.makeLoginQuery() + " and username = '"+username+"' and pass = '"+pass+"'";
    }

    @Override
    public GenericObject getNewRecord(ResultSet resultSet) {
        try {
            return new Instruktor(resultSet.getInt("id"), resultSet.getString("username"), resultSet.getString("pass"),
                                    resultSet.getDouble("plata"), resultSet.getDate("datzap"));
        } catch (SQLException ex) {
            Logger.getLogger(Instruktor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
