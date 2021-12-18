package com.huangbo.log.rmidemo;

import com.huangbo.log.api.IHello;

import java.rmi.Naming;

public class RmiClient {
    public static void main(String[] args) {
        try {
            /* 从RMI Registry中请求stub
             * 如果RMI Service就在本地机器上，URL就是：rmidemo://localhost:1099/hello
             * 否则，URL就是：rmidemo://RMIService_IP:1099/hello
             */
            IHello hello = (IHello) Naming.lookup("rmi://localhost:1099/hello");
            /* 通过stub调用远程接口实现 */
            System.out.println(hello.sayHello());
            System.out.println(hello.sayHello("huangbo"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
