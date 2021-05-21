package cn.jason.spring.bean.chapter01;

/**
 * @ClassName Car
 * @Description TODO
 * @Author jason
 * @Date 2021/5/16 4:43 上午
 * @Version 1.0
 **/

/*
* 各种属性赋值
* */
public class Car {
    private String carName;
    private String carColor;
    private Integer carPrice;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public Integer getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(Integer carPrice) {
        this.carPrice = carPrice;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", carColor='" + carColor + '\'' +
                ", carPrice='" + carPrice + '\'' +
                '}';
    }


}
