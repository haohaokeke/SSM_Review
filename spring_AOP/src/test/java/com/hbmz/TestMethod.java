package com.hbmz;

import com.hbmz.config.SpringConfig;
import com.hbmz.method.FirstMethod;
import com.hbmz.method.SecondMethod;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class TestMethod {

    @Autowired
    private FirstMethod firstMethod;

    @Autowired
    private SecondMethod secondMethod;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test01() {

    firstMethod.method();

    }

    @Test
    public void test02() {

        secondMethod.method();

    }


}