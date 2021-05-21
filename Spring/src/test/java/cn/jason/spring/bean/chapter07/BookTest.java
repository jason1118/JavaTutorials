package cn.jason.spring.bean.chapter07;

import cn.jason.spring.bean.chapter07.servlet.BookServlet;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class BookTest {
    ApplicationContext context = new ClassPathXmlApplicationContext("ioc_9.xml");
    @Test
    public void test(){
        BookServlet bookServlet = context.getBean(BookServlet.class);
        bookServlet.doGet();
    }
}