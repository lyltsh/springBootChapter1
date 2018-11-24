package com.springboot.javaee.chapter3.condition;


/**
 * @author: leiyulin
 * @description:
 * @date:2018/11/247:33 PM
 */
public class WindowsListService implements ListService {
    @Override
    public void showCmd() {
        System.out.println("cmd");
    }
}
