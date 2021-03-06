package cn.jason.spring.bean.chapter01;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/*
 * 测试ioc容器管理bean对象
 * */
public class PersonIoc_2 {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean/ioc_1.xml");
    @Test
    public void test1(){
        Object person = (Person) context.getBean("person");
        System.out.println(person);
    }

    @Test
    public void  test2(){
        //这种获取方式不需要转化类型
        Person person3 = context.getBean("person3", Person.class);
        System.out.println(person3);
    }


}
