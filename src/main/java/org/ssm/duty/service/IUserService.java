package org.ssm.duty.service;

import org.ssm.duty.model.User2;

import java.util.List;
import java.util.Map;

/**
 *
 * @author aidar
 * @date 17-7-27
 */
public interface IUserService {
//    public User2 selectByPrimaryKey(int id);
    public List<User2> queryUser();
}
