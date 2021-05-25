package cn.jason.spring.aop.chapter01.utils;

import java.lang.reflect.Method;
import java.util.Arrays;

public class LogUtil {
     public static void logStart(Method method,Object args){
         System.out.println("["+method.getName()+"]方法开始执行，用的参数列表["+Arrays.asList(args)+"]");
     }
     public static void logReturn(Method method,Object result){
         System.out.println(method.getName()+"方法执行完成，计算结果是"+result);
     }
     public static void logException(Method method,Exception e){
         System.out.println(method.getName()+"方法执行异常+信息是"+e.getCause());
     }
     public static void logEnd(Method method,Object result){
         System.out.println(method.getName()+"方法最终结束了");
     }
}
