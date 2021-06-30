package cn.jason.mybatis03_DynamicSQL;

import cn.jason.mybatis.bean.Employee;

import java.util.List;

public interface EmployeeDynamicSqlMapper {
    public List<Employee> getEmpsByConditionIf(Employee employee);

    public List<Employee> getEmpByConditionForeach(List<Integer> list);
}
