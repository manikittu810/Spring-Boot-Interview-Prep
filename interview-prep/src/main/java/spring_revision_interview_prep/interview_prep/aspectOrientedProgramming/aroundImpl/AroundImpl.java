package spring_revision_interview_prep.interview_prep.aspectOrientedProgramming.aroundImpl;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AroundImpl {
    @Around("execution(* spring_revision_interview_prep.interview_prep.aspectOrientedProgramming.aroundImpl.Employment.empTest())")
    public void aroundMethodImpl(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("Interceptor invoking Before in @Around.....");
        joinPoint.proceed();
        System.out.println("Interceptor invoking After in @Around.....");


    }
}
