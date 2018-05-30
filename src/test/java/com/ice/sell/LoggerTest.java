package com.ice.sell;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by 马玉峰
 * 2018-5-30 10:36:58
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LoggerTest {

    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test1(){
        String name = "mayufeng";
        String password = "1248";

        logger.debug("debug~~~");
        logger.info("info~~~name:" +name+" password: "+password);
        logger.info("name :{} , password :{}",name,password);
        logger.error("error~~~");
    }
}
