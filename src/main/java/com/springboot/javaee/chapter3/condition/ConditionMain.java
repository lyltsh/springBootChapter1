package com.springboot.javaee.chapter3.condition;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: leiyulin
 * @description:
 * @date:2018/11/247:35 PM
 */
public class ConditionMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService = context.getBean(ListService.class);
        listService.showCmd();
    }
}
