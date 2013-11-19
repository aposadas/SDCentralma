/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sevidorcentralproysistemasdistribuidos;

import java.lang.reflect.Array;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author Aileen
 */
public class RemServidorCentralImpl extends UnicastRemoteObject implements RemServidorCentral{

    public static ArrayList<String> sucursales = new ArrayList<>();

    public RemServidorCentralImpl() throws RemoteException  {
        
    }
      
  
    public static ArrayList<String> getSucursales() {
       
        return sucursales;
    }

    @Override
    public void agregarSucursalActiva(String ipSucursal, String numSucursal) {
        sucursales.add("Sucursal "+numSucursal);
        System.out.println("Se Agrego el  ip de las sucursal" + ipSucursal +" num sucursal "+ numSucursal);
        
    }

    @Override
    public String getMessage() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet.");
        
    
    }

    @Override
    public ArrayList<String> listaSucursalActiva() throws RemoteException {
        return sucursales;
        
      
    }
    
  
    
    
}
