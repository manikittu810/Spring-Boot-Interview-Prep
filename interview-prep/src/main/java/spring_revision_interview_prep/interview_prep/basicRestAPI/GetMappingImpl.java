package spring_revision_interview_prep.interview_prep.basicRestAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api")
public class GetMappingImpl {
    @GetMapping(path="/fetch")
    public String fetchUser(){
        return "User details fetched";
    }

    @GetMapping(path = "/save")
    public String saveUser(){
        return "Here are the saved details";
    }
}

