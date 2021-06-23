package cn.jason.mybatis.bean;

/**
 * @ClassName Employee
 * @Description Employee Bean，提供给所有mybatis测试使用
 * @Author jason
 * @Date 2021/6/22 10:40 下午
 **/
public class Employee {
    private Integer id;
    private String lastName;
    private String email;
    private String gender;

    public Employee(Integer id, String lastName, String email, String gender) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
