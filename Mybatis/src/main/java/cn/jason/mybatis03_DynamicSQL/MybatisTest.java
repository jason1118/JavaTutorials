package cn.jason.mybatis03_DynamicSQL;

import cn.jason.mybatis.bean.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MybatisTest {
    private SqlSessionFactory getSqlSessionFactory(){
        InputStream resourceAsStream = null;
        try {
            resourceAsStream = Resources.getResourceAsStream("mybatis01/mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        return build;
    }
    @Test
    public void test01(){
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmployeeDynamicSqlMapper mapper = sqlSession.getMapper(EmployeeDynamicSqlMapper.class);
        Employee emp = new Employee(2, "", null, null);
        List<Employee> empsByConditionIf = mapper.getEmpsByConditionIf(emp);
        for (Employee empList : empsByConditionIf) {
            System.out.println(empList);
        }

        /*测试foreach标签*/
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        List<Employee> empByConditionForeach = mapper.getEmpByConditionForeach(integers);
        System.out.println(empByConditionForeach);
    }
}
