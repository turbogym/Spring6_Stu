package com.byonecup.spring6.bean;

import java.util.Arrays;

/**
 * @Author Turbo
 * @Description TODO
 * @Date 2022/11/16 23:14
 * @Version 1.0
 */
public class Turbo {
    private String[] aiHaos;

    private Digitals[] digitals;

    public void setDigitals(Digitals[] digitals) {
        this.digitals = digitals;
    }

    public void setAiHaos(String[] aiHaos) {
        this.aiHaos = aiHaos;
    }

    @Override
    public String toString() {
        return "Turbo{" +
                "aiHaos=" + Arrays.toString(aiHaos) +
                ", digitals=" + Arrays.toString(digitals) +
                '}';
    }
}
