/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author Filip
 */
public abstract class GenericObject {
    
    public abstract String getColumnNames();
    public abstract String getcolumnValues();
    public abstract String makeWherePrimKey();
    public abstract String getClassName();
    public abstract String getPrimaryKey();
    public abstract String getMessage();
    public abstract GenericObject findRecords(GenericObject genObj);
    public abstract GenericObject getNewRecord(ResultSet resultSet);
    
    public String makeInsert() {
        return "insert into "+getClassName()+" ("+getColumnNames()+")\n"
                +"      values ("+getcolumnValues()+")"
                ;
    }

    public String makeWhere() {
        return "where 1=1 ";
    }

    public String makeSelect() {
        return "select " + getColumnNames()+ "\n"
                +"from " + getClassName()+"\n";
    }
    
    public String makeLoginQuery() {
        return makeSelect() + makeWhere();
    }
    
//    public String makeUpdate() {
//        return "update "+getClassName()+"\n"
//                +"  set "+makeSetNonPrimComlumns()+"\n"
//                +"wehere 1=1 "+makeWherePrimKey();
//    }
//    public abstract String makeSetNonPrimComlumns();

}
