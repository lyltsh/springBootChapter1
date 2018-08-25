package com.springboot.javaee.chapter3.fortest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
@ActiveProfiles("dev")
public class DemoBeanIntegrationTest {
    @Autowired
    private TestBean testBean;

    @Test
    public void testTestBean() {
        String context = "dev test bean";
        String realContext = testBean.getContext();
        Assert.assertEquals(context, realContext);
    }
}
