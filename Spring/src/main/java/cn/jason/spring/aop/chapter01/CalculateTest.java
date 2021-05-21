package cn.jason.spring.aop.chapter01;

import cn.jason.spring.aop.chapter01.impl.MyCalculate;
import cn.jason.spring.aop.chapter01.inter.Calculate;
import org.junit.Test;

public class CalculateTest {
    @Test
    public void test01(){
        Calculate cal = new MyCalculate();
        cal.additive(5, 7);
    }
}
