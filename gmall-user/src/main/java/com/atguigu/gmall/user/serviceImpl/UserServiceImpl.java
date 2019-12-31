package com.atguigu.gmall.user.serviceImpl;


import com.atguigu.gmall.user.dao.UserMapper;
import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * created by Leo徐忠春
 * created Time 2019/12/31-18:52
 * email 1437665365@qq.com
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UmsMember> findAll() {

        List<UmsMember> umsMemberList=userMapper.selectAll();
        return umsMemberList;
    }
}
