package cn.jason.spring.bean.chapter03;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class BookTest {
    ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("ioc_5.xml");

    @Test
    /*
    * 饿汉模式:spring singleton的缺省是饿汉模式
    * 在ioc容器创建的时候给每一个bean生成一个实例。后面获取相同的bean得到的都是同一个实例
    * */
    public void test01(){
        Object book01 = context.getBean("book01");
        Object book02 = context.getBean("book01");
        System.out.println(book01==book02); //true
    }

    @Test
    /*
    *
    *   单实例对象在IOC容器创建时被创建，后面IOC容器自动调用初始化函数。
    *   bean对象被创建！
        bean组件初始化
        bean组件被销毁了
    * */
    public void test02(){
        // context.close();
    }

    @Test
    public void test03(){
        /*
        构造器调用
        {book05}postProcessBeforeInitialization将要初始化这个bean是Book{name='null', price=null}
        bean组件初始化方法
        {book05}postProcessAfterInitialization初始化结束这个bean是Book{name='null', price=null}
        * */
        // postProcessAfterInitialization返回什么bean实例，IOC容器中则保存什么
        // 无论bean是否有初始化方法，后置处理器都会执行工作

    }
}