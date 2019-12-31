package com.atguigu.gmall.user.serviceImpl;



import com.atguigu.gmall.user.dao.UmsMemberReceiveAddressMapper;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.service.UmsMemberReceiveAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * created by Leo徐忠春
 * created Time 2019/12/31-23:39
 * email 1437665365@qq.com
 */
@Service
public class UmsMemberReceiveAddressServiceImpl
        implements UmsMemberReceiveAddressService {

    /**
     *
     */
    @Autowired
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;
    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressId(String memberId) {
        UmsMemberReceiveAddress ums = new UmsMemberReceiveAddress();
        ums.setMemberId(memberId);
        List<UmsMemberReceiveAddress> list =
                umsMemberReceiveAddressMapper.select(ums);

        return list ;
    }
}
