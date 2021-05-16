package cn.jason.spring.bean.chapter01;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonIoc_1 {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ioc_2.xml");

    /*
    * 使用null值赋值
    * */
    @Test
    public void test3(){
        Person1 person1 = context.getBean("person1", Person1.class);
        System.out.println(person1);
        //未作任何赋值 Person1{name='null', age='null', gender='null', email='null', car=null, books=null, maps=null, properties=null}
        //如果xml中property value赋值 value="null"，不是赋值null。合适字符串。
        System.out.println(person1.getName()==null); //false

        //正确的null 赋值是 使用 <property><null></null><property>标签

    }

    @Test
    public void test4(){
        Person1 person2 = context.getBean("person2", Person1.class);
        System.out.println(person2);
        //Person1{name='null', age='null', gender='null', email='null', car=null, books=[Book{bookName='西游记', author='null'}, Book{bookName='水浒传', author='null'}], maps=null, properties=null}
    }

    /*
    * 获取map
    * */
    @Test
    public void test5(){
        Person1 person3 = context.getBean("person2", Person1.class);
        System.out.println(person3);
    }

    /*
    * Properties 赋值
    * */
    @Test
    public void test6(){
        Person1 person2 = context.getBean("person3", Person1.class);
        System.out.println(person2.getProperties()); //{password=123456, username=root}
    }

    /*
    *
    * */
    @Test
    public void test7(){
        Person1 person4 = context.getBean("person4", Person1.class);
        System.out.println(person4);
    }
}