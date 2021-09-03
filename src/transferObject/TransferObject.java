/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transferObject;

import model.GenericObject;

/**
 *
 * @author Filip
 */
public class TransferObject {
    private GenericObject genericObject;
    private boolean signal;
    private String message;

    public TransferObject() {
    }

    public TransferObject(GenericObject genericObject) {
        this.genericObject = genericObject;
    }

    public GenericObject getGenericObject() {
        return genericObject;
    }

    public void setGenericObject(GenericObject genericObject) {
        this.genericObject = genericObject;
    }

    public boolean getSignal() {
        return signal;
    }

    public void setSignal(boolean signal) {
        this.signal = signal;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
