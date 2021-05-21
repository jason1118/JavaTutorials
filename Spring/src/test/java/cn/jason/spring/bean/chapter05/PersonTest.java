package cn.jason.spring.bean.chapter05;

import cn.jason.spring.bean.chapter04.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName PersonTest
 * @Description TODO
 * @Author jason
 * @Date 2021/5/19 5:41 下午
 * @Version 1.0
 **/
public class PersonTest {
    ApplicationContext context = new ClassPathXmlApplicationContext("ioc_7.xml");
    @Test
    public void test01(){
        Person bean = context.getBean(Person.class);
        System.out.println(bean);
    }
}
