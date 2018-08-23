package com.springboot.javaee.chapter2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/8/23
 */
public class ScopeMain {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);

        DemoSingletonService singletonService1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService singletonService2 = context.getBean(DemoSingletonService.class);

        DemoPrototypeService prototypeService1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService prototypeService2 = context.getBean(DemoPrototypeService.class);

        System.out.println(singletonService1 == singletonService2);
        System.out.println(prototypeService1 == prototypeService2);
    }
}
