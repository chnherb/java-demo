package com.huangbo.log.rmidemo;

import com.huangbo.log.api.IHello;
import com.huangbo.log.api.impl.HelloImpl;

import javax.naming.NamingException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RmiServer {
    public static void main(String[] args) throws RemoteException, NamingException, AlreadyBoundException {
        IHello hello = new HelloImpl();
        LocateRegistry.createRegistry(1099);
        Registry registry = LocateRegistry.getRegistry();
//        Reference reference = new Reference("", "", "http://127.0.0.1:1099/hello");
//        ReferenceWrapper refObjWrapper = new ReferenceWrapper(reference);
        registry.bind("hello", hello);
//        registry.rebind("hello", hello);
    }
}
