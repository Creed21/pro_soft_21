/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systeOper;

import database.ConnectionProperty;
import database.DbBroker;
import model.GenericObject;

/**
 *
 * @author Filip
 */
public abstract class SystemOperation {

    private ConnectionProperty connectionProperty;
    protected DbBroker dbBroker;
    private GenericObject go;

    public void setConnectionProperty(ConnectionProperty connectionProperty) {
        this.connectionProperty = connectionProperty;
        this.dbBroker=  new DbBroker(connectionProperty);
    }
    
    public SystemOperation() {
        this.dbBroker = new DbBroker(connectionProperty);
    }

    public boolean performGenericOperation() {
        dbBroker.openConnection();
        boolean signal = perform();
        if(signal) 
            dbBroker.commitTrans();
        else 
            dbBroker.rollbackTrans();
        
        dbBroker.closeConnection();
            
        return signal;
    }
    
    public boolean performSelect() {
        dbBroker.openConnection();
        boolean signal = perform();
        return signal;
    }
    
    public abstract boolean perform();

}
