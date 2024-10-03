package spring_revision_interview_prep.interview_prep.aspectOrientedProgramming.combiningTwoPointCuts;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class NamedPointCut {
    @Pointcut("execution(* spring_revision_interview_prep.interview_prep.aspectOrientedProgramming.combiningTwoPointCuts.EmpController.*())")
    public void customPointCutName(){

    }

    @Before("customPointCutName()")
    public void triggerBeforeMethod()
    {
        System.out.println("Inside customPointCut Impl @Before Advice....");
    }
}
