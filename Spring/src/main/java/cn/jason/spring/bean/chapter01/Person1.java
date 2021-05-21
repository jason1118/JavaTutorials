package cn.jason.spring.bean.chapter01;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @ClassName Person2
 * @Description TODO
 * @Author jason
 * @Date 2021/5/16 4:45 上午
 * @Version 1.0
 **/

/*
* 各种属性类型赋值
* */
public class Person1 {
    private String name;
    private String age;
    private String gender;
    private String email;
    private Car car;
    private List<Book> books;
    private Map<String, Object> maps;
    private Properties properties;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", car=" + car +
                ", books=" + books +
                ", maps=" + maps +
                ", properties=" + properties +
                '}';
    }
}
