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
  
## @Qualifier

假设根据类查找能查到两个或更多，此时根据变量名查找。如果变量名不能确定装配哪个就会报错

此时，如果类中如果好多地方引用变量名，也不好做修改，此时可以使用@Qualifier指定一个名字作为id

通常可以快速指定装配子类或父类

## @Autowired 属性 required
@Autowired(required=false) 意思找不到不要报错，装配null。

## @Autowired作用位置

可以修饰类、属性字段、属性方法、注解

如果是属性方法。容器在创建的时候就会自动注入。不需要等到执行时再去获取

```java
//容器创建的时候就已经自动注入
public void test(BookDao bookDao,@Qualifier("bookService") BookService bookService){}
```

## @Resource 注解

也是自动装配注解 包括 @Injection 也是

@AutoWired 最强大
@Resource 在javax下，java拓展标准。是j2ee的
@Injection 在EJB下

@Autowired和@Resource区别

@Resource扩展性更强，如果切换成另外一个容器框架还是可以使用

