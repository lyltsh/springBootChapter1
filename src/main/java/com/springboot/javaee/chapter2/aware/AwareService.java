package com.springboot.javaee.chapter2.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * 实现BeanNameAware和ResourceLoaderAware接口，获取bean名称和资源加载的服务
 * @Author: leiyulin
 * @date: 2018/8/23
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {
    private String beanName;
    private ResourceLoader resourceLoader;

    @Override
    public void setBeanName(String name) {
        this.beanName = beanName;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public void outputResult() {
        System.out.println("beanName: " + beanName);

        Resource resource = resourceLoader.getResource("classpath:/com/springboot/javaee/chapter2/aware/test.txt");
        try {
            System.out.println("ResourceLoader加载的文件为：" +
                    IOUtils.toString(resource.getInputStream()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
