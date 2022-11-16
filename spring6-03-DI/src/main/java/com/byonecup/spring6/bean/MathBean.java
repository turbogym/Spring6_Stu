package com.byonecup.spring6.bean;

/**
 * @Author Turbo
 * @Description TODO
 * @Date 2022/11/16 23:59
 * @Version 1.0
 */
public class MathBean {
    private String result;

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "MathBean{" +
                "result='" + result + '\'' +
                '}';
    }
}
