package cn.jason.spring.bean.chapter04;

import java.util.List;
import cn.jason.spring.bean.chapter01.Book;

public class Person {
    private String name;
    private int age;
    private Car car;
    private List<Book> books;
    private Double salary;
    private String email;
    private String gender;


    public Person() {
    }

    public Person(Car car) {
        this.car = car;
        System.out.println("Car构造器被调用");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                ", books=" + books +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }
}
