package com.springboot.javaee.chapter2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/8/23
 */
public class JSR250WayService {
    @PostConstruct
    public void init(){
        System.out.println("jrs250-init-method");
    }

    public JSR250WayService() {
    }

    @PreDestroy
    public void destroy(){
        System.out.println("jrs250-destroy-method");
    }
}
