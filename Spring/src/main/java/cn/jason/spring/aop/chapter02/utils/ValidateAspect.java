package cn.jason.spring.aop.chapter02.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @ClassName ValidateAspect
 * @Description TODO
 * @Author jason
 * @Date 2021/5/25 9:21 下午
 * @Version 1.0
 **/

/*
* 多个切面一起执行
* */


 @Component
 @Aspect
public class ValidateAspect {
    @Before("cn.jason.spring.aop.chapter02.utils.LogUtil.hahaMyPoint()")
    public void logStart(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        Signature signature = joinPoint.getSignature();
        String methodName = signature.getName();
        System.out.println("[validate-前置]["+methodName+"]方法开始执行，用的参数列表["+ Arrays.asList(args)+"]");
    }
    @AfterReturning(value = "cn.jason.spring.aop.chapter02.utils.LogUtil.hahaMyPoint()", returning = "result")
    public static void logReturn(JoinPoint joinPoint, Object result){
        Signature signature = joinPoint.getSignature();
        String name = signature.getName();
        System.out.println("[validate-返回]方法"+signature+"执行完成，计算结果是"+result);
    }
    @AfterThrowing(value = "cn.jason.spring.aop.chapter02.utils.LogUtil.hahaMyPoint()", throwing = "exception")
    public static void logException(JoinPoint joinPoint, Exception exception){
        Object[] args = joinPoint.getArgs();
        Signature signature = joinPoint.getSignature();
        String methodName = signature.getName();
        System.out.println("[validate-异常]"+methodName+"方法执行异常,参数列表是"+ Arrays.asList(args)+"错误信息是"+exception);
    }
    @After("cn.jason.spring.aop.chapter02.utils.LogUtil.hahaMyPoint()")
    public static void logEnd(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        Signature signature = joinPoint.getSignature();
        String name = signature.getName();
        System.out.println("[validate-结束]方法"+name+"执行了，最终结束了，参数是"+Arrays.asList(args));
    }
}
