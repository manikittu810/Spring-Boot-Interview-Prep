package spring_revision_interview_prep.interview_prep.aspectOrientedProgramming.basicExample;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class BeforeMethod {
    @Before("execution(public String spring_revision_interview_prep.interview_prep.aspectOrientedProgramming.basicExample.AOPTest.test())")
    public void print(){
        System.out.println("********************************************");
        System.out.println("Intercepting test() method from AOPTest Class....");
        System.out.println("********************************************");
    }

}
