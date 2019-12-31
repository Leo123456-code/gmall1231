package com.atguigu.gmall.user.controller;


import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * created by Leo徐忠春
 * created Time 2019/12/31-18:50
 * email 1437665365@qq.com
 */
@RestController
@RequestMapping

public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getAllUser")
    public List<UmsMember> getAllUser() {

        List<UmsMember> umsMembers = userService.findAll();
        return umsMembers;

    }

    /**
     * 根据用户id查询收货地址
     */
}
