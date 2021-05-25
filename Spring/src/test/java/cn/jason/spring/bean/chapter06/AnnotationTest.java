package cn.jason.spring.bean.chapter06;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AnnotationTest {
    ApplicationContext context = new ClassPathXmlApplicationContext("bean/ioc_8.xml");
    @Test
    public void test(){
        //1.如果注解没有参数则是默认值（类名首字母小写）
        Object bookDao1 = context.getBean("bookDao");
        Object bookDao2 = context.getBean("bookDao");
        System.out.println(bookDao1==bookDao2); //使用注解和xml配置一样，组件都是默认单实例模式
    }

    @Test
    public void test01(){
        // 2.自定义类的bean ID
        Object defineBookDao = context.getBean("defineBookDao");
        System.out.println(defineBookDao); //cn.jason.spring.bean.chapter06.dao.BookDao@358c99f5
    }

    @Test
    public void test02(){
        // 3.测试组件注册的方式（实例模式）
        // xml中@Scope("prototype")
        Object defineBookDao1 = context.getBean("defineBookDao");
        Object defineBookDao2 = context.getBean("defineBookDao");
        System.out.println(defineBookDao1 == defineBookDao2); //false
    }

    @Test
    public void test03(){
        //use-default-filters属性
        Object bookService = context.getBean("bookService");
        System.out.println(bookService);
    }
}