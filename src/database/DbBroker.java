/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.GenericObject;
import model.Instruktor;

/**
 *
 * @author Filip
 */
public class DbBroker {
    private ConnectionProperty connectionProperty;
    private Connection connection;
    private ResultSet resultSet;
    private Statement statement;
    
    public DbBroker(ConnectionProperty connectionProperty) {
        this.connectionProperty = connectionProperty;
    }

    public ConnectionProperty getConnectionProperty() {
        return connectionProperty;
    }

    public void setConnectionProperty(ConnectionProperty connectionProperty) {
        this.connectionProperty = connectionProperty;
    }
        
    public synchronized boolean openConnection() {
        try {
//            Class.forName(connectionProperty.getDriver()).newInstance();
            if(connectionProperty == null) {
                System.out.println("connection property in dbBroker is null");
                return false;
            }
            String url = connectionProperty.getURL();
            String user = connectionProperty.getUser();
            String password = connectionProperty.getPassword();
            
            connection = DriverManager.getConnection(url, user, password);
            connection.setAutoCommit(false);
            
            return true;
        } catch (SQLException  ex) {
            Logger.getLogger(DbBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public synchronized boolean closeConnection() {
        try {
            if(connection != null) connection.close();
            if(resultSet != null) resultSet.close();
            if(statement != null) statement.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DbBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public synchronized boolean commitTrans() {
        try {
            connection.commit();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DbBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public synchronized boolean rollbackTrans() {
        try {
            connection.rollback();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DbBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public synchronized GenericObject logIn(GenericObject instruktor) {
        resultSet = null;
        String query = instruktor.makeLoginQuery();
//        System.out.println(query);
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            if(resultSet.next())
                return instruktor.getNewRecord(resultSet);
        } catch (SQLException ex) {
            Logger.getLogger(DbBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
}
