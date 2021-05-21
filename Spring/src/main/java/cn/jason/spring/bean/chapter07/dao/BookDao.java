package cn.jason.spring.bean.chapter07.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 * @ClassName BookDao
 * @Description TODO
 * @Author jason
 * @Date 2021/5/19 10:30 下午
 * @Version 1.0
 **/
@Repository
public class BookDao {

    public void saveBook(){
        System.out.println("保存图书！");
    }
}
