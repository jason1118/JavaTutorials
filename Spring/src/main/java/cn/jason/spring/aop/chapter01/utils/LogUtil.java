package cn.jason.spring.aop.chapter01.utils;

import java.util.Arrays;

public class LogUtil {
     public static void logStart(Object... objects){
         System.out.println(Arrays.asList(objects));
     }
}
