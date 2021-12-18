package com.huangbo.log.api;

import java.rmi.Remote;

public interface IHello extends Remote {
    public String sayHello() throws java.rmi.RemoteException;

    public String sayHello(String name) throws java.rmi.RemoteException;
}
