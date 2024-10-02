package spring_revision_interview_prep.interview_prep.aspectOrientedProgramming.withinWildCrad;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class WithinImpl {

    //use this API to test : http://localhost:8080/aop-test/test3
    @Before("within(spring_revision_interview_prep.interview_prep.aspectOrientedProgramming.basicExample.AOPTest))")
    public void withinImpl1() {
        System.out.println("##################################################################");
        System.out.println("Intercepting all-test() method's from AOPTest Class.... : WithinImpl1");
        System.out.println("##################################################################");
    }

    @Before("within(spring_revision_interview_prep.interview_prep..*)")
    public void withinImpl2() {
        System.out.println("##################################################################");
        System.out.println("Intercepting all-test() method's from AOPTest Class.... : WithinImpl2");
        System.out.println("##################################################################");
    }

    //PointCut expr -> @within -> matches and intercepts which has @Service annotation
    @Before("@within(org.springframework.stereotype.Service))")
    public void withinImpl3() {
        System.out.println("##################################################################");
        System.out.println("Intercepting all-test() method's from AOPTest Class.... : WithinImpl3");
        System.out.println("##################################################################");
    }

    //@annotation -> matches and intercepts the methods which contain the annotations like @GetMapping, @PostMappings and etc...
    @Before("@annotation(org.springframework.web.bind.annotation.GetMapping))")
    public void withinImpl4() {
        System.out.println("##################################################################");
        System.out.println("Intercepting all-test() method's from AOPTest Class.... : WithinImpl4");
        System.out.println("##################################################################");
    }

    //args()  -> Pointer expr matches any method with particular arguments or parameters
    //@Before("args(String,int)") ->just an example

    @Before("args(String,int)")
    public void withinImpl5() {
        System.out.println("##################################################################");
        System.out.println("Intercepting all-test() method's which takes arguments of above PointerCut-type from AOPTest Class.... : WithinImpl5");
        System.out.println("##################################################################");
    }

    //@args(you need to specify the annotation path)  -> Pointer expr matches any method with particular arguments or parameters
    //@Before(@args(org.springframework.stereotype.Service)) -> just an example
//breaking the code not sure why? Debugging needed----------------------------
//    @Before("@args(org.springframework.stereotype.Repository)")
//    public void withinImpl6() {
//        System.out.println("Intercepting all-test() method's which are annotated with @Service from AOPTest Class.... : WithinImp6");
//    }
    //-------------------------------------------------------------------



}
