package com.byonecup.spring6.bean;

import java.util.Date;

/**
 * @Title Spring6_Stu Student
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/19 02:17
 * @Version 1.0
 */
public class Student {
    private Date birth;

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "birth=" + birth +
                '}';
    }
}
