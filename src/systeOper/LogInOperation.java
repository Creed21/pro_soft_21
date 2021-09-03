/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systeOper;

import database.ConnectionProperty;
import database.DbBroker;
import model.GenericObject;
import model.Instruktor;
import transferObject.TransferObject;

/**
 *
 * @author Filip
 */
public class LogInOperation extends SystemOperation {
    
    private TransferObject transferObject;

    public boolean logIn(TransferObject transferObject) {
        this.transferObject = transferObject;
        return performGenericOperation();
    }
    
    @Override
    public boolean perform() {
        System.out.println("System operation perform: "+dbBroker.getConnectionProperty());
        GenericObject instruktor = dbBroker.logIn(transferObject.getGenericObject());
        boolean signal = false;
        if(instruktor != null) {
            signal = true;
            transferObject.setGenericObject(instruktor);
        }
        else
            transferObject.setMessage("Korisnik ne postoji u sistemu!");

        transferObject.setSignal(signal);
        System.out.println(transferObject.getSignal());
        System.out.println(transferObject.getMessage());
        System.out.println("insttuktor u metodi LogInOperation.perfom"+(Instruktor)instruktor);
        return signal;
    }
    
}
