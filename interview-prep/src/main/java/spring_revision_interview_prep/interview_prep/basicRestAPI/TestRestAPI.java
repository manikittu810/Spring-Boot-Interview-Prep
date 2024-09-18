package spring_revision_interview_prep.interview_prep.basicRestAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestAPI {
    @GetMapping("/api")
    public String resApi(){
        return "Hello world!";
    }

}
