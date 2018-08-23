package com.springboot.javaee.chapter2.profile;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/8/23
 */
public class DemoBean {
    private String content;

    public DemoBean(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
