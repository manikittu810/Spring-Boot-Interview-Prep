package spring_revision_interview_prep.interview_prep.scope.singleton;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring_revision_interview_prep.interview_prep.scope.userClass.User1;

@RestController
@RequestMapping(path="/testt-scope")
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class TestController2 {
    @Autowired
    User1 user1;

    public TestController2(){
        System.out.println("Bean TestController2 created by IoC....");
    }

    @PostConstruct
    public void printHashCodes(){
        System.out.println("HashCode of TestController2 is : " + this.hashCode() + ", The Hash code of User1 is : " + user1.hashCode());
    }

    @GetMapping(path="/test2")
    public ResponseEntity<String> init(){
        System.out.println("Test2 @GetMapping");
        return ResponseEntity.status(HttpStatus.OK).body("Test2 API working Successfully");
    }


}
