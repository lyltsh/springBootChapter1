package com.springboot.javaee.chapter2.conditional;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/8/24
 */
public class MacListService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
