package cn.jason.spring.aop.chapter02.impl;

import cn.jason.spring.aop.chapter02.inter.Calculate;
import org.springframework.stereotype.Service;

@Service
public class MyCalculate /*implements Calculate*/ {

    public int additive(int i, int j){
        System.out.println("环绕代理执行了内部方法");
        int result = i + j;
        return result;
    }
    public int subtractive(int i, int j){
        int result = i - j;
        return result;
    }
    public int multiplication(int i, int j){
        int result = i * j;
        return result;
    }
    public int division(int i, int j){
        int result = i / j;
        return result;
    }
}
