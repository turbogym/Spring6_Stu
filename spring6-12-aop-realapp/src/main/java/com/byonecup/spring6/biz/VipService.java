package com.byonecup.spring6.biz;

import org.springframework.stereotype.Service;

/**
 * @Title Spring6_Stu VipService
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/24 22:15
 * @Version 1.0
 */
@Service
public class VipService {

    public void saveVip() {
        System.out.println("新增会员信息");
    }

    public void deleteVip() {
        System.out.println("删除会员信息");
    }

    public void modifyVip() {
        System.out.println("修改会员信息");
    }

    public void getVip() {
        System.out.println("获取会员信息");
    }
}
