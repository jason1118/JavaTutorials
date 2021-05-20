# @AutoWired

IOC的真正为例是帮助我们管理实例。主要核心是：

1. 需要管理的类加入注解@Controller @Service @Repository @Component
（这四个注解没有什么实际区别）都是@Compnent的衍生。主要是标记是需要被扫描组件

2. xml配置自动扫描

3. 需要使用的地方使用@AutoWired注解赋值（DI依赖注入）（获取实例赋值）


原理：

1. 先按照类型去找

private BookService bookService; 先得到BookService类型去容器中找到组件
相当于 bookService = ioc.getBean("BookService.class")

* 找到？找到即赋值 
* 找不到？BookService 上//@Service的话则抛异常（未找到）
* 找到多个？
    1. 按照类型(BookService)查找（@AutoWired会查找类和类子类BookServiceExt）
    2. 按照变量名即bookService作为id继续匹配 （BookService的默认id为bookService）

 