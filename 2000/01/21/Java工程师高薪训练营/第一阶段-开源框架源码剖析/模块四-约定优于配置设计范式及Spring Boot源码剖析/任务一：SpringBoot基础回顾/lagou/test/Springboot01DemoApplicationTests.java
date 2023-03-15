package com.lagou.springboot_01_demo;

import com.lagou.config.JdbcConfiguration;
import com.lagou.pojo.AnotherComponent;
import com.lagou.pojo.OwnerProperties;
import com.lagou.pojo.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest
class Springboot01DemoApplicationTests {

    @Autowired
    private Person person;


    @Test
    void contextLoads() {
        System.out.println(person);
    }

    @Autowired
    private JdbcConfiguration jdbcConfiguration;

    @Autowired
    private DataSource dataSource;

    @Test
    public void test1(){
        System.out.println(jdbcConfiguration);
        System.out.println(dataSource);
    }

    @Autowired
    private AnotherComponent anotherComponent;

    @Test
    public void test2(){
        System.out.println(anotherComponent);
    }

    @Autowired
    private OwnerProperties ownerProperties;

    @Test
    public void test3(){
        System.out.println(ownerProperties);
    }

    Logger logger = LoggerFactory.getLogger(this.getClass());

    /*
        测试日志输出
        SLF4J 日志级别（从小到大）：trace<debug<info<warn<error  只会输出比当前级别更高的级别日志
        日志级别：我们是可以进行手动调整级别
     */
    @Test
    public void testLog(){
       // System.out.println();

        logger.trace("trace日志....");
        logger.debug("debug日志....");

        // springboot中，日志的默认级别就是info级别 root级别
        logger.info("info日志....");
        logger.warn("warn日志....");
        logger.error("error日志....");


    }





}
