package cn.jason.spring.aop.chapter02.utils;

import javafx.beans.binding.ObjectExpression;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
@Aspect
public class LogUtil {
        /*
        * @Before  //在目标方法之前运行 前置通知
        * @After  //在目标方法结束之后  后置通知
        * @AfterReturning  // 在目标方法正常返回之后 返回通知
        * @AfterThorwing  // 在目标方法抛出异常之后  异常通知
        * Around //环绕 环绕通知
        *
        * try{
        *   @Before
        *   method.invoke(obj,args);
        *   @AfterReturning
        * }catch(e){
        *   @AfterThrowing
        * }finally{
        *   @After
        * }
        *这是五个通知注解，如果需要可以自己扩展定义
        *
        * 切入点表达式
        * execution("访问权限符 返回值类型 方法签名")
        * execution(cn.jason.spring.aop.chapter02.impl.MyCalculate.additive(int,int))
        **/

    /*
    * 抽取可重复使用的切入表达式
    *
    * */


    @Pointcut("execution(public int cn.jason.spring.aop.chapter02.impl.MyCalculate.additive(..))")
    public void hahaMyPoint(){}
    // 需要使用这个表达式的地方使用方法名引入 @After("hahaMyPoint()")




     //@Before("execution(public int cn.jason.spring.aop.chapter02.impl.MyCalculate.*(int,int))") //切入点表达式
     public static void logStarta(JoinPoint joinPoint){
         Object[] args = joinPoint.getArgs();
         Signature signature = joinPoint.getSignature();
         String methodName = signature.getName();
         System.out.println("["+methodName+"]方法开始执行，用的参数列表["+Arrays.asList(args)+"]");
     }
     //@AfterReturning(value="execution(public int cn.jason.spring.aop.chapter02.impl.MyCalculate.*(int,int))",returning = "result") //切入点表达式
     public static void logReturn(JoinPoint joinPoint, Object result){
         Signature signature = joinPoint.getSignature();
         String name = signature.getName();
         System.out.println("方法"+signature+"执行完成，计算结果是"+result);
     }
     //@AfterThrowing(value="execution(public int cn.jason.spring.aop.chapter02.impl.MyCalculate.*(int,int))",throwing="exception")
     public static void logException(JoinPoint joinPoint, Exception exception){
         Object[] args = joinPoint.getArgs();
         Signature signature = joinPoint.getSignature();
         String methodName = signature.getName();
         System.out.println(methodName+"方法执行异常,参数列表是"+ Arrays.asList(args)+"错误信息是"+exception);
     }
     //@After(value="execution(public int cn.jason.spring.aop.chapter02.impl.MyCalculate.*(int,int))")
     public static void logEnd(JoinPoint joinPoint){
         Object[] args = joinPoint.getArgs();
         Signature signature = joinPoint.getSignature();
         String name = signature.getName();
         System.out.println("方法"+name+"执行了，最终结束了，参数是"+Arrays.asList(args));
     }


     /*
     * 环绕通知
     * try{
     *      @Before //前置通知
     *      method.invoke(obj,args);
     *      @Returning // 返回通知
     * }catch(){
     *      @Throwing //异常通知
     * }finally{
     *      @After //完成通知
     * }
     *
     * 环绕通知是四合一通知：
     * 环绕通知中有一个参数 ProceedingJoinPoint pjp
     *
     * */

    @Around("hahaMyPoint()")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        Object proceed = null;
        try {
            System.out.println("这里是前置通知");
            proceed = pjp.proceed(args);
            System.out.println("这里是返回通知");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("这里是异常通知");
        } finally {
            System.out.println("这里是结束通知");
        }
        //这个方法就是相当与手写代理的 method.invoke(obj,args);
        //如果这里都用参数，不执行方法，那就不用谈成功异常等通知了
        return proceed;
    };

}
