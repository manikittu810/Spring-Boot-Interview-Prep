package spring_revision_interview_prep.interview_prep.aspectOrientedProgramming.combiningTwoPointCuts;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class Emp {
    @Before("execution(* spring_revision_interview_prep.interview_prep.aspectOrientedProgramming.combiningTwoPointCuts.EmpController.*())" +
    "&& @within(org.springframework.web.bind.annotation.RestController)")
    public void printEmp(){
        System.out.println("inside Emp interceptor1");
    }


    @Before("execution(* spring_revision_interview_prep.interview_prep.aspectOrientedProgramming.combiningTwoPointCuts.EmpController.*())" +
            "|| @within(org.springframework.stereotype.Component)")
    public void printEmp1(){
        System.out.println("inside Emp interceptor2");
    }
}
