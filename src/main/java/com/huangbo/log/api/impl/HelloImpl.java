package com.huangbo.log.api.impl;

import com.huangbo.log.api.IHello;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/* java.rmidemo.server.UnicastRemoteObject构造函数中将生成stub和skeleton */
public class HelloImpl extends UnicastRemoteObject implements IHello, Serializable {
    private static final long serialVersionUID = -408940949653876358L;

    // 这个实现必须有一个显式的构造函数，并且要抛出一个RemoteException异常
    public HelloImpl() throws RemoteException {
        super();
        System.out.println("helloImpl");
    }
    public String sayHello() throws RemoteException {
        return "Hello World ! ";
    }
    public String sayHello(String name) throws RemoteException {
        return "Hello " + name + " ! ";
    }
}