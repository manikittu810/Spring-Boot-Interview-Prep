package spring_revision_interview_prep.interview_prep.aspectOrientedProgramming.basicExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import spring_revision_interview_prep.interview_prep.aspectOrientedProgramming.Service.ServiceImpl;
import spring_revision_interview_prep.interview_prep.aspectOrientedProgramming.Service.ServiceImpl1;

@RestController
@RequestMapping(path = "/aop-test")
public class AOPTest {
    @Autowired
    @Qualifier("TEmployee")
    IEmployee iEmployee;

    ServiceImpl service; // instantiating ServiceImpl object
    ServiceImpl1 service1; // instantiating ServiceImpl1 object
    EmployeeUtil employee;

    //Constructor Injection
    public AOPTest(ServiceImpl service,ServiceImpl1 service1,EmployeeUtil employee){//injecting the service object
        this.service = service;
        this.service1= service1;
        this.employee=employee;
    }
    @GetMapping(path="/test1")
    public String test(@RequestParam String smk){
        return "Test1 API call successfully Hit....Interceptor Invoked Successfully : " + smk ;
    }
    @GetMapping(path="/test2")
    public String test1(){
        return "Test2 API call successfully Hit....Interceptor Invoked Successfully,route  : /test2 API"  ;
    }
    @GetMapping(path="/test3")
    public String test3(){
        service.print();
        return "Test3 API call successfully Hit for class ServiceImpl....Interceptor Invoked Successfully, route  : /test3 API"  ;
    }
    @GetMapping(path="/test4")
    public String test4(){
        service1.printService("Test4",4);
        return "Test4 API call successfully Hit for class ServiceImpl1 ....Interceptor Invoked Successfully, route  : /test4 API"  ;
    }
    @GetMapping(path="/test5")
    public String test5(){
        employee.employeeHelper();
        return "Test5 API call successfully Hit for class EmployeeUtil ....Class Invoked Successfully, route  : /test5 API"  ;
    }
    @GetMapping(path="/test6")
    public String test6(){
        iEmployee.fetchEmployee();
        return "Test6 API call successfully Hit for class IEmployee ....Temporary Employee Class Invoked Successfully, route  : /test6 API"  ;
    }
}
