package spring_revision_interview_prep.interview_prep.scope.protoType;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/test-scope")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TestController3 {
    @Autowired
    User2 user2;
    @Autowired
    Student student;

    public TestController3(){
        System.out.println("Bean Initialized TestController3.....");
    }

    @PostConstruct
    public void init(){
        System.out.println("HashCode of TestController3 :" +this.hashCode()
                + "\nHashcode of Student : " + student.hashCode()
                +"\nHashcode of User2 : " + user2.hashCode() );
    }

    @GetMapping(path = "/test3")
    public ResponseEntity<String> printAPI(){
        System.out.println("This is TestController3 GetMapping");
        return ResponseEntity.status(HttpStatus.OK).body("API TestController3 working Successfully......");
    }
}
