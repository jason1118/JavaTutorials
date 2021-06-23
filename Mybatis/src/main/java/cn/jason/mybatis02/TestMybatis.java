package cn.jason.mybatis02;

import cn.jason.mybatis.bean.Employee;
import cn.jason.mybatis02.dao.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;

/**
 * @ClassName TestMybatis
 * @Description TODO
 * @Author jason
 * @Date 2021/6/22 10:45 下午
 **/
public class TestMybatis {
    /**
     * 封装方法：回去SqlSession
     * @return
     */
    private SqlSessionFactory getSqlSession() {
        Reader asReader = null;
        try {
            asReader = Resources.getResourceAsReader("mybatis01/mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(asReader);
        return factory;
    }

    @Test
    public void test01(){
        SqlSessionFactory sqlSessionFactory = getSqlSession();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        //查询一条数据
        Employee emp = mapper.getEmp(2);
        System.out.println(emp);
    }
}
