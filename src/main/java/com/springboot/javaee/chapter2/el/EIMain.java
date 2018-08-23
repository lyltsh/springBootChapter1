package com.springboot.javaee.chapter2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/8/23
 */
public class EIMain {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig elConfig = context.getBean(ElConfig.class);
        elConfig.outputResource();
        context.close();
    }
}
