package com.jlh.demoworkweb.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jlh.demoworkweb.mapper.UserMapper;
import com.jlh.demoworkweb.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: jiluohao
 * Date: 2018-09-28 11:26
 * Description:
 */
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/user")
    public Page<User> getUser(){
        return PageHelper.startPage(0,10).doSelectPage(()->userMapper.findAll());
    }
}
