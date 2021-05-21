package cn.jason.spring.bean.chapter07.service;

import cn.jason.spring.bean.chapter07.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName BookService
 * @Description TODO
 * @Author jason
 * @Date 2021/5/19 10:30 下午
 * @Version 1.0
 **/
@Service
public class BookService {
    @Autowired
    private BookDao bookDao;
    public void save(){
        System.out.println("bookService正在调用dao保存图书");
        bookDao.saveBook();
    }
}
