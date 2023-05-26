package com.hbmz.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AOP {

    @Pointcut("execution(* com.hbmz.method.SecondMethod.method(..))")
    private void pt(){}

    //通知
    @Before("pt()")
    public void method() {

        System.out.println(System.currentTimeMillis());

    }


}
