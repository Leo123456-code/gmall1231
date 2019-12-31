package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.service.UmsMemberReceiveAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * created by Leo徐忠春
 * created Time 2019/12/31-23:40
 * email 1437665365@qq.com
 */
@RestController

public class UmsMemberReceiveAddressController {
    @Autowired
    private UmsMemberReceiveAddressService umsMemberReceiveAddressService;

    @RequestMapping("/getReceiveAddressId")
    public List<UmsMemberReceiveAddress> getReceiveAddressId
            (String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddress =
                umsMemberReceiveAddressService.getReceiveAddressId(memberId);
        return umsMemberReceiveAddress;

    }

}
