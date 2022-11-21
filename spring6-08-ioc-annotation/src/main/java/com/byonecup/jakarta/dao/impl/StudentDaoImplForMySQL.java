package com.byonecup.jakarta.dao.impl;

import com.byonecup.jakarta.dao.StudentDao;
import org.springframework.stereotype.Repository;

/**
 * @Title Spring6_Stu StudentDaoImpl
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/22 02:17
 * @Version 1.0
 */
//@Repository
@Repository("studentDao")
public class StudentDaoImplForMySQL implements StudentDao {
    @Override
    public void deleteById() {
        System.out.println("MySQL数据库正在删除学生信息...");
    }
}
