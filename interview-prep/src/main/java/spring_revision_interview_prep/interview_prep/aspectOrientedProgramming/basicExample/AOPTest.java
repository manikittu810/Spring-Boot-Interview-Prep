package spring_revision_interview_prep.interview_prep.aspectOrientedProgramming.basicExample;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/aop-test")
public class AOPTest {
    @GetMapping(path="/test1")
    public ResponseEntity<String> test(){
        System.out.println("Executed After Interceptor Executed....");
        return ResponseEntity.status(HttpStatus.OK).body("Test1 API call successfully Hit....Interceptor Worked Successfully");

    }
}
