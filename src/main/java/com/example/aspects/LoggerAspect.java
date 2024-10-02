package com.example.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Logger;

@Aspect
@Component

public class LoggerAspect {
    private final Logger logger = Logger.getLogger("Auditing Logs");


    //    @Around("execution(* com.example.beans.*.*(..))")
//    public Object logInfo(ProceedingJoinPoint joinPoint) throws Throwable {
//       logger.info(joinPoint.getSignature().getDeclaringTypeName() + ". start " + joinPoint.getSignature().getName());
//       logger.info(joinPoint.getSignature().getName());
//       var start= Instant.now();
//       joinPoint.proceed();
//       var end= Instant.now();
//       long timeElapsed= Duration.between(start, end).toMillis();
//       logger.info("Time Elapsed "+timeElapsed);
//       logger.info(joinPoint.getSignature().getDeclaringTypeName() + ". end " + joinPoint.getSignature().getName());
//
//       return joinPoint.proceed();
//    }
    @Around("@annotation(com.example.annotations.LogExecutionTime)")
    public Object logInfo(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info(joinPoint.getSignature().getDeclaringTypeName() + ". start " + joinPoint.getSignature().getName());
        logger.info(joinPoint.getSignature().getName());
        var start = Instant.now();
        joinPoint.proceed();
        var end = Instant.now();
        long timeElapsed = Duration.between(start, end).toMillis();
        logger.info("Time Elapsed " + timeElapsed);
        logger.info(joinPoint.getSignature().getDeclaringTypeName() + ". end " + joinPoint.getSignature().getName());

        return joinPoint.proceed();
    }

}
