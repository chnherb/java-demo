package com.huangbo.log;

import lombok.extern.slf4j.Slf4j;

//import java.util.logging.Logger;
//import org.apache.log4j.Logger;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;


@Slf4j
public class Log4JDemo {
    public static void main(String[] args) {
        String name = "${java:os}";
        // @Slf4j
        log.info(name);
        // slf4j LoggerFactory
        final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(Log4JDemo.class);
        LOGGER.info(name);
//        // log4j Logger
//        final org.apache.log4j.Logger LOGGER1 = org.apache.log4j.Logger.getLogger(Log4JDemo.class);
//        LOGGER1.info(name);
        // log4j2 LogManager
        final org.apache.logging.log4j.Logger LOGGER2 = org.apache.logging.log4j.LogManager.getLogger(Log4JDemo.class);
        LOGGER2.info(name);
        LOGGER2.error(name);

    }
}
