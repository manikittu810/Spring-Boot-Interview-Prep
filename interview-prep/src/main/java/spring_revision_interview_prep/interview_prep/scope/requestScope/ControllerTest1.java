package spring_revision_interview_prep.interview_prep.scope.requestScope;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/test-scope")
@Scope("request")
public class ControllerTest1 {
    @Autowired
    User3 user3;
    @Autowired
    Student2 student2;

    public ControllerTest1(){
        System.out.println("Bean initialized for ControllerTest1..... ");
    }

    @PostConstruct
    public void init(){
        System.out.println("HashCode for ControllerTest1 : " +this.hashCode()+
                "\nHashCode for Student2 : " +student2.hashCode()+
                "\nHashCode for User3 : " +user3.hashCode());
    }

    @GetMapping(path="/test4")
    public ResponseEntity<String> printSomething(){
        System.out.println("Request Scope GetMapping .....");
        return ResponseEntity.status(HttpStatus.OK).body("Request Scope API test Successful...");
    }
}
