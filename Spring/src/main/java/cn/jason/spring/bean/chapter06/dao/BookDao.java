package cn.jason.spring.bean.chapter06.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @ClassName BookDao
 * @Description TODO
 * @Author jason
 * @Date 2021/5/19 10:30 下午
 * @Version 1.0
 **/
@Repository("defineBookDao")
@Scope("prototype")
public class BookDao {
}
