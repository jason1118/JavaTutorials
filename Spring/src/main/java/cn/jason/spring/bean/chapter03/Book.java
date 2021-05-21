package cn.jason.spring.bean.chapter03;

/**
 * @ClassName Book
 * @Description TODO
 * @Author jason
 * @Date 2021/5/17 10:33 下午
 * @Version 1.0
 **/
public class Book {
    private String name;
    private Integer price;

    public void beanInit(){
        System.out.println("bean组件初始化方法");
    }

    public void beanDestroy(){
        System.out.println("bean组件被销毁方法");
    }

    public Book() {
        System.out.println("构造器调用");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
