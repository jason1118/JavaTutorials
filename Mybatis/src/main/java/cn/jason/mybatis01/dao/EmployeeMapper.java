package cn.jason.mybatis01.dao;/*
 * @InterfaceName
 * @Author
 * @Description TODO
 * @Date 2021/6/22 9:26 下午
 **/


import cn.jason.mybatis.bean.Employee;

public interface EmployeeMapper {
    Employee getEmp(Integer id);

    Integer addEmp(Employee employee);
}
