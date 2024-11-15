package org.expandablesupportservices.ecommerceshop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	  @Before("execution(* org.expandablesupportservices.ecommerceshop..*.*(..))")
	    public void logMethodCall(JoinPoint joinPoint) {
	        String className = joinPoint.getTarget().getClass().getSimpleName();
	        String methodName = joinPoint.getSignature().getName();
	        System.out.println("Aspect Executing " + className + "." + methodName + "()");
	    }

}
