package spring_revision_interview_prep.interview_prep.scope.singleton;

import jakarta.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring_revision_interview_prep.interview_prep.scope.userClass.User1;

@RestController
@RequestMapping(path="/test-scope")
public class TestController {
    @Autowired
    User1 user;
    public TestController(){
        //creates a bean
        System.out.println("TestController Bean created in IoC ......");
    }

    @PostConstruct
    public void printHash(){
        System.out.println("The HashCode of TestController Object is : "+ this.hashCode() + ", User Object HashCode is : " + user.hashCode());
    }

    @GetMapping(path="/test1")
    public ResponseEntity<String> init(){
        System.out.println("This is from test Controller Get Mapping.....");
        return ResponseEntity.status(HttpStatus.OK).body("Successful");
    }
}
