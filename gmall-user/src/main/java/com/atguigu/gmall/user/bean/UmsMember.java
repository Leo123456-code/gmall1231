package com.atguigu.gmall.user.bean;


import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * created by Leo徐忠春
 * created Time 2019/12/31-20:15
 * email 1437665365@qq.com
 */
@Table(name="ums_member")
@Data

public class UmsMember {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String memberLevelId;
    //用户名
    private String username;
    //密码
    private String password;
    //昵称
    private String nickname;
    //手机号码
    private String phone;
    //帐号启用状态:0->禁用；1->启用
    private Integer status;
    //注册时间
    private Date createTime;
    //头像
    private String icon;
    //性别：0->未知；1->男；2->女
    private Integer gender;
    //生日
    private Date birthday;
    //所做城市
    private String city;
    //职业
    private String job;
    //个性签名
    private String personalizedSignature;
    //用户来源
    private Integer sourceType;
    //积分
    private Integer integration;
    //成长值
    private Integer growth;
    //剩余抽奖次数
    private Integer luckeyCount;
    //历史积分数量
    private Integer historyIntegration;



}
