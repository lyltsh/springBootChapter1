package com.springboot.javaee.chapter2.event;

import org.springframework.context.ApplicationEvent;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/8/23
 */
public class DemoEvent extends ApplicationEvent{
    private static final long serialVersionUID = 1L;
    private String msg;
    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
