package cn.jason.spring.bean.chapter04;

public class Car {
    private String brandName;
    private Integer price;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandName='" + brandName + '\'' +
                ", price=" + price +
                '}';
    }
}
