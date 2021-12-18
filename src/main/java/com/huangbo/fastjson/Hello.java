package com.huangbo.fastjson;

import lombok.Data;

@Data
public class Hello { // 这里需要为public才能调用到
    String hello;

    public Hello() {
        try {
            Runtime.getRuntime().exec(new String[]{"/bin/bash", "-c",
                    "/Applications/Calendar.app/Contents/MacOS/Calendar"});
        } catch (Exception e) {
        }
    }
}