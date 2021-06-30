package cn.jason.mybatis02.dao;/*
 * @InterfaceName
 * @Author
 * @Description TODO
 * @Date 2021/6/22 9:26 下午
 **/


import cn.jason.mybatis.bean.Department;
import cn.jason.mybatis.bean.Employee;

public interface EmployeeMapper {
    Employee getEmp(Integer id);
    Employee getEmpAndDept(Integer id);

    /*
    * 测试Resultmap
    * association 通过select属性
    * */
    Employee getEmpAndDeptSelect(Integer id);

    /*
        结果集中对集合处理（一对多）
     */
    Department getDeptIncEmps(Integer id);
}
