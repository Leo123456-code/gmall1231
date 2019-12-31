package com.atguigu.gmall.user.dao;


import com.atguigu.gmall.user.bean.UmsMember;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

/**
 * created by Leo徐忠春
 * created Time 2019/12/31-18:51
 * email 1437665365@qq.com
 */

public interface UserMapper extends BaseMapper<UmsMember> {

    List<UmsMember> selectAllUser();
}
