package cn.jason.spring.bean.chapter04;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {
    ApplicationContext context = new ClassPathXmlApplicationContext("bean/ioc_6.xml");
    @Test
    public void test01(){
        Person bean = context.getBean(Person.class);
        System.out.println(bean);
    }
}