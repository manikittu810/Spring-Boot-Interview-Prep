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
@Scope("singleton")
@RequestMapping(path="/test-scope")
public class NoHttpCall {
    @Autowired
    User5 user5;
    public NoHttpCall(){
        System.out.println("Bean initialized for NoHttpCall..... ");
    }

    @PostConstruct
    public void init(){
        System.out.println("HashCode for NoHttpCall : " +this.hashCode()+
                "\nHashCode for User5 : " +user5.hashCode());
    }

    @GetMapping(path="/test5")
    public ResponseEntity<String> printSomething(){
        System.out.println("Request Proxy Scope Revoked ..... GetMapping .....");
        System.out.println("Dummy method called while after api invoked : "+user5.dummyMethod());
        return ResponseEntity.status(HttpStatus.OK).body("Proxy - Request Scope API test Successful...");
    }
}
