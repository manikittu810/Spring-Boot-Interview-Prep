package spring_revision_interview_prep.interview_prep.aspectOrientedProgramming.aroundImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/emp-test3")
public class AroundController {
    @Autowired
    Employment emp1;
    @GetMapping("/test")
    public String fetchIt(){
        emp1.empTest();
        return "Item Lost";
    }
}
