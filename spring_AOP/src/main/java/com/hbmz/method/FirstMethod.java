package com.hbmz.method;

import org.springframework.stereotype.Component;

@Component
public class FirstMethod {
    public void method() {

        System.out.println(System.currentTimeMillis());
        System.out.println("first method ...");

    }
}
