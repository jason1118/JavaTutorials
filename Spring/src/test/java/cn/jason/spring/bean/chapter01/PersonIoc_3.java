package cn.jason.spring.bean.chapter01;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/*
 * 测试ioc容器管理bean对象
 * */
public class PersonIoc_3 {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ioc_3.xml");
    /*
    * 属性配置继承测试
    * */
    @Test
    public void test1() {
        Person1 person = context.getBean("person1", Person1.class);
        System.out.println(person);//Person1{name='李四', age='18', gender='男', email='email', car=null, books=null, maps=null, properties=null}

        Person1 person1 = context.getBean("person", Person1.class);
        //System.out.println(person1); //BeanIsAbstractException
    }


}
