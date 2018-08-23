package com.springboot.javaee.chapter2.prepost;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/8/23
 */
public class BeanWayService {
    public void init(){
        System.out.println("@Bean-init-method");
    }

    public BeanWayService() {
        super();
        System.out.println("BeanWayService Constructor");
    }

    public void destroy(){
        System.out.println("@Bean-destroy-method");
    }
}
