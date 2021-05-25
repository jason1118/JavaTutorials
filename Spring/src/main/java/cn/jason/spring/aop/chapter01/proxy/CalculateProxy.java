package cn.jason.spring.aop.chapter01.proxy;

import cn.jason.spring.aop.chapter01.inter.Calculate;
import cn.jason.spring.aop.chapter01.utils.LogUtil;
import org.apache.commons.logging.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @ClassName CalculateProxy
 * @Description 生成代理对象的类
 * @Author jason
 * @Date 2021/5/21 11:06 下午
 * @Version 1.0
 **/
public class CalculateProxy {
    public static Calculate getProxy(final Calculate calculate){ //参数 被代理对象
        ClassLoader loader = calculate.getClass().getClassLoader(); //被代理对象类加载器
        Class<?>[] interfaces = calculate.getClass().getInterfaces(); //被代理对象实现了哪些接口
//处理器（帮助目标对象执行目标方法
        InvocationHandler handler = new InvocationHandler() {
            /*
             * proxy:代理对象，给jdk使用。
             * method：当前将要执行的目标对象的方法
             * args:方法调用时，外界传入的值
             * */
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//利用反射立即执行方法
                Object result = null;//规定：如果是内部类中使用外面变量需要final修饰 final Calculate calculate
                try {
                    LogUtil.logStart(method,args);
                    result = method.invoke(calculate, args);
                    LogUtil.logReturn(method,args);
                } catch (Exception e) {
                    LogUtil.logException(method,e);
                } finally {
                    LogUtil.logEnd(method,args);
                }
//result就是目标方法执行后的返回值
                return result; //返回出去，外界才能拿返回值
            }
        };
        Object proxy = Proxy.newProxyInstance(loader, interfaces, handler);
        return (Calculate) proxy;
    }
}
