package cn.jason.spring.bean.chapter02;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @className: AirPlanTest
 * @description: TODO 类描述
 * @author: JasonWu
 * @date: 2021/5/16
 **/
public class AirPlanTest {

    ClassPathXmlApplicationContext contex = new ClassPathXmlApplicationContext("ioc_4.xml");
    @Test
    public void test01(){
        Object bean = contex.getBean("airPlane1");
        System.out.println(bean);
    }

    @Test
    public void test02(){
        Object airPlan02 = contex.getBean("airPlan02");
        System.out.println(airPlan02);
    }
}