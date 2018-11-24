package com.springboot.javaee.chapter3.annotation;

import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/8/24
 */
@Service
public class AnnotationDemoService {
    public void outputResult(){
        System.out.println("从组合注解配置获得的bean");
    }
}
