package com.byonecup.spring6.bean;

import org.springframework.beans.factory.FactoryBean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Title Spring6_Stu DateFactoryBean
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/19 02:23
 * @Version 1.0
 */
public class DateFactoryBean implements FactoryBean<Date> {

    // DateFactoryBean这个工厂Bean协助我们Spring创建这个普通的Bean：Date。

    private String strDate;

    public DateFactoryBean(String strDate) {
        this.strDate = strDate;
    }

    @Override
    public Date getObject() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(strDate);
        return date;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
