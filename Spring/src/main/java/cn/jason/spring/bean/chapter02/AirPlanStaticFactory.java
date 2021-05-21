package cn.jason.spring.bean.chapter02;

/**
 * @className: AirPlanInstanceFactory
 * @description: TODO 类描述
 * @author: JasonWu
 * @date: 2021/5/16
 **/
public class AirPlanStaticFactory {
    public static AirPlan getAirPlan(String engine){
        AirPlan airPlan = new AirPlan();
        airPlan.setLength(19);
        airPlan.setEngine(engine);
        airPlan.setEngineDataLogger("xxx");
        airPlan.setDriverName("x");
        return airPlan;
    }
}
