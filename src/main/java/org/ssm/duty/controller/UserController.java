package org.ssm.duty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.ssm.duty.model.User2;
import org.ssm.duty.service.IUserService;

import java.util.HashMap;
import java.util.List;

/**
 *
 * @author aidar
 * @date 17-7-27
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping(value="displayAllUser", method = RequestMethod.GET)
    @ResponseBody
    public HashMap<String, List<User2>> displayAllUser() {
        HashMap<String, List<User2>> map = new HashMap<String, List<User2>>();
        map.put("users", userService.queryUser());
        return map;
    }
}
