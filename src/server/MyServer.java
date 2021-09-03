/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import database.ConnectionProperty;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Filip
 */
public class MyServer {

//    private ServerProperty serverProp;
    ConnectionProperty connProperty;
    private ServerSocket serverSocket;
    
    public MyServer(ConnectionProperty connProperty) {
        this.connProperty = connProperty;
    }
    
    public MyServer() {
//        readServerProperty();
        try {
            serverSocket = new ServerSocket(65111);
            
            while(true) {
                
            }
        } catch (IOException ex) {
            Logger.getLogger(MyServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//    private void readServerProperty() {
//        try (BufferedReader br = new BufferedReader(new FileReader("config/server.config"));) {
//            String line = "";
//
//            ServerProperty sp = null;
//            while (line != null) {
//                sp = new ServerProperty();
//                line = br.readLine(); // header delimiter #
//                sp.setPort(Integer.parseInt(br.readLine().split("=")[1].trim())); // port
//                line = br.readLine(); // footer delimiter #
//            }
//            
//            serverProp = sp;
//
//            System.out.println("done reading server config: "+sp.getHost()+":"+sp.getPort());
//
//        } catch (IOException ex) {
//            Logger.getLogger(MyServer.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

    
}
