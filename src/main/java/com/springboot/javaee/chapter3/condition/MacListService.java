package com.springboot.javaee.chapter3.condition;


/**
 * @author: leiyulin
 * @description:
 * @date:2018/11/247:34 PM
 */
public class MacListService implements ListService {
    @Override
    public void showCmd() {
        System.out.println("ls");
    }
}
