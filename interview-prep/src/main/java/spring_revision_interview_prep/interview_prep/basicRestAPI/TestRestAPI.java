package spring_revision_interview_prep.interview_prep.basicRestAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/test")
public class TestRestAPI {
    @GetMapping(value = "/api",produces = "text/plain")
    public String resApi(){
        return "Hello world!"+"\n"+"This is my Practice RestAPI";
    }

}
