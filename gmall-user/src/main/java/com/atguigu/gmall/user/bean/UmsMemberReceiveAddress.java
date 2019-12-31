package com.atguigu.gmall.user.bean;


import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

/**
 * created by Leo徐忠春
 * created Time 2019/12/31-23:18
 * email 1437665365@qq.com
 */
@Table(name="ums_member_receive_address")
@Data
public class UmsMemberReceiveAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String memberId;
    //收货人名称
    private String name;
    //电话号码
    private String phoneNumber;
    //状态
    private Integer defaultStatus;
    //邮政编码
    private String postCode;
    //省份/直辖市
    private String province;
    //城市
    private String city;
    //区
    private String region;
    //详细地址(街道)
    private String detailAddress;
}
