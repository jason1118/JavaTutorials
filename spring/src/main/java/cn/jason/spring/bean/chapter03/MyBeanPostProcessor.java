package cn.jason.spring.bean.chapter03;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @ClassName MyBeanPostProcessor
 * @Description TODO
 * @Author jason
 * @Date 2021/5/18 12:00 上午
 * @Version 1.0
 **/
public class MyBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("{"+beanName+"}postProcessBeforeInitialization将要初始化"+"这个bean是"+bean);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("{"+beanName+"}postProcessAfterInitialization初始化结束"+"这个bean是"+bean);
        //初始化之后返回的bean实例（返回的是什么IOC容器中保存的是什么
        return bean;
    }
}
