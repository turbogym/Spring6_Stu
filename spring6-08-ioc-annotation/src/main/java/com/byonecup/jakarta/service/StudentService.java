package com.byonecup.jakarta.service;

import com.byonecup.jakarta.dao.StudentDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @Title Spring6_Stu StudentService
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/22 02:18
 * @Version 1.0
 */
@Service
public class StudentService {
//    @Resource(name = "studentDaoImplForMySQL")
    @Resource
    private StudentDao studentDao;

    // 不能出现在构造方法上
//    @Resource(name = "studentDaoImplForMySQL")
//    public StudentService(StudentDao studentDao) {
//        this.studentDao = studentDao;
//    }

//    @Resource(name = "studentDaoImplForMySQL")
//    public void setStudentDao(StudentDao studentDao) {
//        this.studentDao = studentDao;
//    }

    public void deleteStudent() {
        studentDao.deleteById();
    }
}
