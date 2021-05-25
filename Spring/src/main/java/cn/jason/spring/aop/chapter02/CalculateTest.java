package cn.jason.spring.aop.chapter02;

import cn.jason.spring.aop.chapter02.impl.MyCalculate;
import cn.jason.spring.aop.chapter02.inter.Calculate;
//import cn.jason.spring.aop.chapter02.proxy.CalculateProxy;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalculateTest {
    @Test
    public void test01(){
//        Calculate cal = new MyCalculate();
//        cal.additive(5, 7);
    }

    /*
    * 代理调用
    * */

    @Test
    public void test02(){
//        Calculate cal = new MyCalculate();
//        Calculate proxy = CalculateProxy.getProxy(cal);
//        int additive = proxy.additive(3, 6);
//        System.out.println(additive);
    }
    /*
    * AOP注解测试
    * */
    @Test
    public void test03(){
        ApplicationContext context = new ClassPathXmlApplicationContext("aop/aop_1.xml");
        Calculate bean = context.getBean(Calculate.class);
        bean.additive(3, 4);
        System.out.println(bean);
        System.out.println(bean.getClass());



    }

    @Test
    public void test04(){
        /*
        * 如果类没有实现接口，按照类型获取
        * */
        ApplicationContext context = new ClassPathXmlApplicationContext("aop/aop_1.xml");
        MyCalculate bean = context.getBean(MyCalculate.class);
        System.out.println(bean);
        System.out.println(bean.getClass());
        /*
        * cn.jason.spring.aop.chapter02.impl.MyCalculate@52af26ee
            class cn.jason.spring.aop.chapter02.impl.MyCalculate$$EnhancerBySpringCGLIB$$f1043bd1
            * 没有接口使用CGLIB创建代理对象。内部类实现本类所有方法
        * */
    }

    @Test
    public void test05(){
        ApplicationContext context = new ClassPathXmlApplicationContext("aop/aop_1.xml");
        MyCalculate bean = context.getBean(MyCalculate.class);
        bean.additive(1, 2);
        bean.division(1, 0);
    }


    /*
    * 测试环绕通知
    *
    * */

    @Test
    public void test06(){
        ApplicationContext context = new ClassPathXmlApplicationContext("aop/aop_1.xml");
        MyCalculate bean = context.getBean(MyCalculate.class);
        bean.additive(1, 2);
    }

    /*
    * 两个切面同时切入
    * */
    @Test
    public void test07(){
        ApplicationContext context = new ClassPathXmlApplicationContext("aop/aop_1.xml");
        MyCalculate bean = context.getBean(MyCalculate.class);
        bean.additive(1, 2);
    }
}
