##基于XML的自动装配

自定义类型的属性是一个对象，这个对象可能在容器中存在
1. property属性手动赋值
2. 自动装配（自动赋值）
    * bean属性 autowire="default" (byName,byType,constructor,no,deafult)
      1. byName:按照名字（属性名作为ID去容器中找，private Car car）此处就是id=car条件
      2. byType:按照类型（属性类型作为Class去容器中找）Car就是类型测试多个类型相同-异常 ：NoUniqueBeanDefinitionException
      3. constructor 
         * 先按照类型装配public (Car car)（person bean中的属性方法）
         * 先按照有参构造器的参数类型装配，找到就赋值（相同类型只有一个情况，多个则还要比较ID值，也就是属性名car）
         * 没有有参构造则赋值null
         * 如果按照类型找到多个：参数的名作为ID继续匹配，找到就装配，找不到就
       NoUniqueBeanDefinitionException: No qualifying bean of type 'cn.jason.spring.bean.chapter04.Car' available: expected single matching bean but found 2: car02,car01



3. List类型属性通过自动装配可以自动装配所有元素
   
   Person{name='null', age=0, car=Car{brandName='宝马', price=null}, books=[Book{bookName='Java Core1', author='null'}, Book{bookName='Java Core2', author='null'}]}