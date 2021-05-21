package cn.jason.spring.bean.chapter02;

/**
 * @className: AirPlanInstanceFactory
 * @description: TODO 类描述
 * @author: JasonWu
 * @date: 2021/5/16
 **/
public class AirPlanInstanceFactory {
    public AirPlan getAirPlan(String engine){
        AirPlan airPlan = new AirPlan();
        airPlan.setEngine(engine);
        return airPlan;
    }
}
