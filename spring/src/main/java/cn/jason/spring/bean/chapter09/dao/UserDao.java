package cn.jason.spring.bean.chapter09.dao;

import cn.jason.spring.bean.chapter09.bean.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao extends BaseDao<User> {
    @Override
    public void save() {
        System.out.println("用户正在保存");
    }
}
