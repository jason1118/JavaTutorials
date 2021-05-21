package cn.jason.spring.bean.chapter09.dao;

import cn.jason.spring.bean.chapter09.bean.Book;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao extends BaseDao<Book>{
    @Override
    public void save() {
        System.out.println("图书正在保存");
    }
}
