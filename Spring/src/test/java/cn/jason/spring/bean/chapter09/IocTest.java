package cn.jason.spring.bean.chapter09;

import cn.jason.spring.bean.chapter09.service.BookService;
import cn.jason.spring.bean.chapter09.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest {
    ApplicationContext context = new ClassPathXmlApplicationContext("bean/ioc_10.xml");
    @Test
    public void test(){
        BookService bookService = context.getBean(BookService.class);
        UserService userService = context.getBean(UserService.class);

        bookService.save();
        userService.save();
    }
}