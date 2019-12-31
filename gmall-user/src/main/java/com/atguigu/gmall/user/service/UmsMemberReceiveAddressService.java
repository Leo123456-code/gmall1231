package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * created by Leo徐忠春
 * created Time 2019/12/31-23:38
 * email 1437665365@qq.com
 */
public interface UmsMemberReceiveAddressService {

    List<UmsMemberReceiveAddress> getReceiveAddressId(String memberId);
}
