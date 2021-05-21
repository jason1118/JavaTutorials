package cn.jason.spring.aop.chapter01;

import cn.jason.spring.aop.chapter01.impl.MyCalculate;
import cn.jason.spring.aop.chapter01.inter.Calculate;
import cn.jason.spring.aop.chapter01.proxy.CalculateProxy;
import org.junit.Test;

public class CalculateTest {
    @Test
    public void test01(){
        Calculate cal = new MyCalculate();
        cal.additive(5, 7);
    }

    /*
    * 代理调用
    * */

    @Test
    public void test02(){
        Calculate cal = new MyCalculate();
        Calculate proxy = CalculateProxy.getProxy(cal);
        int additive = proxy.additive(3, 6);
        System.out.println(additive);
    }
}
