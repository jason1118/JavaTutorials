package cn.jason.spring.bean.chapter08;

import cn.jason.spring.bean.chapter07.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration("classpath:ioc_9.xml")
@RunWith(SpringJUnit4ClassRunner.class) //使用SpringJUnit4ClassRunner测试所有@Test方法
public class SpringTest {

    @Autowired
    private BookService bookService;

    @Test
    public void test() {
        System.out.println(bookService);
    }
}
