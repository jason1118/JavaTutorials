package cn.jason.mybatis.bean;

/**
 * @ClassName Employee
 * @Description Employee Bean，提供给所有mybatis测试使用
 * @Author jason
 * @Date 2021/6/22 10:40 下午
 **/
public class Employee {
    private String lastName;
    private String email;
    private String gender;

    public Employee(String lastName, String email, String gender) {
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
