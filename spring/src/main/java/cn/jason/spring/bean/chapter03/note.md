### bean组件生命周期


#### 初始化和销毁
IOC创建的实例分为
* 单实例：在IOC容器创建时创建实例，每次getBean都是一个实例
* 多实例：在组件获取时创建实例，获取一次调用构造器创建一个

> 单例模式分为**饿汉模式**和**懒汉模式**
> 
> 饿汉模式：spring singleton的缺省是饿汉模式:启动容器时(即实例化容器时),
> 为所有spring配置文件中定义的bean都生成一个实例
> 
> 懒汉模式：在第一个请求时才生成一个实例,以后的请求都调用这个实例
>

默认scope="singleton"  scope="prototype"，则为多例


#### 后置处理器（BeanPostProcessor）

Spring接口beanPostProcessor接口提供两个后置方法。

postProcessAfterInitialization返回什么bean实例，IOC容器中则保存什么

无论bean是否有初始化方法，后置处理器都会执行工作