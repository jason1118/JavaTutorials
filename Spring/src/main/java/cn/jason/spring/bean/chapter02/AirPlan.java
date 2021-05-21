package cn.jason.spring.bean.chapter02;

/**
 * @className: AirPlan
 * @description: TODO 类描述
 * @author: JasonWu
 * @date: 2021/5/16
 **/
public class AirPlan {
    private String engine;
    private String engineDataLogger;
    private Integer length;
    private String driverName;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getEngineDataLogger() {
        return engineDataLogger;
    }

    public void setEngineDataLogger(String engineDataLogger) {
        this.engineDataLogger = engineDataLogger;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public String toString() {
        return "AirPlan{" +
                "engine='" + engine + '\'' +
                ", engineDataLogger='" + engineDataLogger + '\'' +
                ", length=" + length +
                ", driverName='" + driverName + '\'' +
                '}';
    }
}
