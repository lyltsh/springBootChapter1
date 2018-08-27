package com.springboot.javaee.chapter3.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/8/24
 */
public class AnnotationMain {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationDemoService.class);
        AnnotationDemoService annotationDemoService = context.getBean(AnnotationDemoService.class);
    }
}
