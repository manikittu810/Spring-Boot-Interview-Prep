package spring_revision_interview_prep.interview_prep.aspectOrientedProgramming.wildCard;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class BeforeMethod {
//    Different PointCut Implementations
    @Before("execution(public String spring_revision_interview_prep.interview_prep.aspectOrientedProgramming.basicExample.AOPTest.test1())")
    public void print(){
        System.out.println("********************************************");
        System.out.println("Intercepting test() method from AOPTest Class....");
        System.out.println("********************************************");
    }

    //(*) using wildcard
    @Before("execution(*  spring_revision_interview_prep.interview_prep.aspectOrientedProgramming.basicExample.AOPTest.test1())")
    public void pointCutImpl1(){
        System.out.println("********************************************");
        System.out.println("Intercepting test() method from AOPTest Class.... : pointCutImpl1");
        System.out.println("********************************************");
    }

    @Before("execution(*  spring_revision_interview_prep.interview_prep.aspectOrientedProgramming.basicExample.AOPTest.*())")
    public void pointCutImpl2(){
        System.out.println("********************************************");
        System.out.println("Intercepting test() method from AOPTest Class.... : pointCutImpl2");
        System.out.println("********************************************");
    }

    //http://localhost:8080/aop-test/test1?smk="Mani" use this API to test the below PointCut Expr
    //expects the test() method in AOPTest should have a class which takes atleast one Parameter or Argument.
    @Before("execution(*  spring_revision_interview_prep.interview_prep.aspectOrientedProgramming.basicExample.AOPTest.test(*))")
    public void pointCutImpl3(){
        System.out.println("********************************************");
        System.out.println("Intercepting test() method from AOPTest Class.... : pointCutImpl3");
        System.out.println("********************************************");
    }


    //(..) -> matches 0 or more items
    //test() can contain 0 or more parameters or Arguments
    @Before("execution(*  spring_revision_interview_prep.interview_prep.aspectOrientedProgramming.basicExample.AOPTest.test(..))")
    public void pointCutImpl4(){
        System.out.println("********************************************");
        System.out.println("Intercepting test() method from AOPTest Class.... : pointCutImpl4");
        System.out.println("********************************************");
    }

    @Before("execution(*  spring_revision_interview_prep.interview_prep..test1())")
    public void pointCutImpl5(){
        System.out.println("********************************************");
        System.out.println("Intercepting test() method from AOPTest Class.... : pointCutImpl5");
        System.out.println("********************************************");
    }

    @Before("execution(*  spring_revision_interview_prep.interview_prep..*())")
    public void pointCutImpl6(){
        System.out.println("********************************************");
        System.out.println("Intercepting test() method from AOPTest Class.... : pointCutImpl6");
        System.out.println("********************************************");
    }


}
