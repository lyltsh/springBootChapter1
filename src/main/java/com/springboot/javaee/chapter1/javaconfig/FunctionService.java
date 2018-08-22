package com.springboot.javaee.chapter1.javaconfig;

import org.springframework.stereotype.Service;

@Service
public class FunctionService {
    public String printHello(String word) {
        return "hello" + word;
    }
}
