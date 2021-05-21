package cn.jason.spring.bean.chapter09.service;

import cn.jason.spring.bean.chapter09.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseService<T>{
    @Autowired
    private BaseDao<T> baseDao;
    public void save(){
        baseDao.save();
    }
}
