package cn.jason.spring.bean.chapter07.servlet;

import cn.jason.spring.bean.chapter07.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @ClassName BookServlet
 * @Description TODO
 * @Author jason
 * @Date 2021/5/19 10:30 下午
 * @Version 1.0
 **/
/*
* 属性自动注入
* AutoWired:Spring自动为属性赋值
* */
@Controller
public class BookServlet {
    @Qualifier("bookService") //指定一个变量作为ID查找
    @Autowired
    private BookService bookServiceExt2;
    public void doGet(){
        bookServiceExt2.save();
    }
}
