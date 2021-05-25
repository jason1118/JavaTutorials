package cn.jason.spring.bean.chapter01;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonIoc_1 {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean/ioc_2.xml");

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

    /*
    * 级联属性赋值
    * 就是给属性的属性赋值
    * 注意：级联属性如果修改的是引用类型，那么原始的对象的属性会被修改
    * */
    @Test
    public void test8(){
        Person1 person8 = context.getBean("person8", Person1.class);
        System.out.println(person8.getCar());
    }
}