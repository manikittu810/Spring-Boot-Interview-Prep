package spring_revision_interview_prep.interview_prep.basicRestAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api")
public class RequestParamImpl {
    @GetMapping(path ="/v1")
    public String print(
            @RequestParam(name = "firstName") String firstName,
            @RequestParam(name = "lastName",required = false) String lastName,
            @RequestParam(name = "age") int age
    ){
          return "My name is " + firstName +" "+lastName +" and my age is " + age;

    }
}
