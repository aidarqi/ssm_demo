package org.ssm.duty.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ssm.duty.dao.User2Dao;
import org.ssm.duty.model.User2;
import org.ssm.duty.service.IUserService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Copyright (C), 2017, 银联智惠信息服务（上海）有限公司
 *
 * @author aidar
 * @version 0.0.1
 * @desc 信数的call back请求
 * @date 17-7-27
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired (required = true)
    private User2Dao userDao;

//    @Override public User2 selectByPrimaryKey(int id) {
//        return userDao.selectByPrimaryKey(id);
//    }

    @Override public List<User2> queryUser() {
        return userDao.queryUser();
    }
}
