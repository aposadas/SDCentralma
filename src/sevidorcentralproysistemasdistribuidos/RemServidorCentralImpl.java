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

    private ArrayList<String> sucursales = new ArrayList<>();

    public RemServidorCentralImpl() throws RemoteException  {
    }
    
    
   

    @Override
    public ArrayList<String> listaSucursalActiva() {
        return  sucursales;
    }

    @Override
    public void agregarSucursalActiva(String ipSucursal) {
        sucursales.add(ipSucursal);
        System.out.println("Se envio el  ip de las sucursal" + ipSucursal);
    }

    @Override
    public String getMessage() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet.");
        
    
    }
    
}
