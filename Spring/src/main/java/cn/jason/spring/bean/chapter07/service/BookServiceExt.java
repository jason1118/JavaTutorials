package cn.jason.spring.bean.chapter07.service;

import cn.jason.spring.bean.chapter07.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceExt extends BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public void save(){
        System.out.println("这个BookServiceExt调用save方法");
    }
}
