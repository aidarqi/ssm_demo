package org.ssm.test;

import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.ssm.duty.model.User2;
import org.ssm.duty.service.IUserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Copyright (C), 2017, 银联智惠信息服务（上海）有限公司
 *
 * @author aidar
 * @version 0.0.1
 * @desc 信数的call back请求
 * @date 17-7-27
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBatis {
    private static Logger logger = Logger.getLogger(TestMyBatis.class);
    private ApplicationContext ac = null;

    @Resource
    private IUserService userService;

//    @Before
//    public void before() {
//        ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
//        userService = (IUserService) ac.getBean("userService");
//    }

    @Test
    public void test1() {
//        User user = userService.getUserById(1);
        // System.out.println(user.getUserName());
        // logger.info("值："+user.getUserName());
        List<User2> user = userService.queryUser();
        logger.info(JSON.toJSONString(user));
    }
}
