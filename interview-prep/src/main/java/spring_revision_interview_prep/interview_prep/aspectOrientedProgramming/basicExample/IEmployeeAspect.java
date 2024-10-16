package spring_revision_interview_prep.interview_prep.aspectOrientedProgramming.basicExample;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class IEmployeeAspect {
    @Before("target(spring_revision_interview_prep.interview_prep.aspectOrientedProgramming.basicExample.IEmployee)")
    public void interceptorForIEmployee(){
        System.out.println("Interceptor for IEmployee Invoked");
    }
}
