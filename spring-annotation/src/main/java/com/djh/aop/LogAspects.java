package com.djh.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * @Author AceDJH
 * @Date 2021/1/14 16:58
 */
@Aspect
public class LogAspects {
    // 抽取公共的切入点表达式
    @Pointcut("execution(public int com.djh.aop.MathCalculator.*(..))")
    public void pointCut(){
    }

    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("Before除法运行..." + name + "参数列表是：" + Arrays.asList(args));
    }
    @After("pointCut()")
    public void logEnd(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("After除法结束..." + name);
    }

    @AfterReturning(value = "pointCut()", returning="result")
    public void logReturn(JoinPoint joinPoint, Object result){
        String name = joinPoint.getSignature().getName();
        System.out.println("AfterReturning除法正常结束..." + name + "结果是" + result);
    }

    @AfterThrowing(value = "pointCut()", throwing = "exception")
    public void logException(JoinPoint joinPoint, Exception exception){
        String name = joinPoint.getSignature().getName();
        System.out.println("AfterThrowing除法异常..." + name + "异常信息" + exception);
    }
}
