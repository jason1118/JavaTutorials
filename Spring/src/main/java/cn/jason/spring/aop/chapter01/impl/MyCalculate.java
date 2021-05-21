package cn.jason.spring.aop.chapter01.impl;

import cn.jason.spring.aop.chapter01.inter.Calculate;
import cn.jason.spring.aop.chapter01.utils.LogUtil;

public class MyCalculate implements Calculate {

    public int additive(int i, int j){
        LogUtil.logStart(i,j);
        int result = i + j;
        return result;
    }
    public int subtractive(int i, int j){
        LogUtil.logStart(i,j);
        int result = i + j;
        return result;
    }
    public int multiplication(int i, int j){
        LogUtil.logStart(i,j);
        int result = i + j;
        return result;
    }
    public int division(int i, int j){
        LogUtil.logStart(i,j);
        int result = i + j;
        return result;
    }
}
