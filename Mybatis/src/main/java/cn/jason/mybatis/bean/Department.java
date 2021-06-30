package cn.jason.mybatis.bean;

import java.util.List;

public class Department {
    private Integer id;
    private String deptName;
    private List<Employee> emps;

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", deptName='" + deptName + '\'' +
                ", emps=" + emps +
                '}';
    }
}
