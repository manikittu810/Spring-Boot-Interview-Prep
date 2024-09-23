package spring_revision_interview_prep.interview_prep.basicRestAPI.annotationsExamples;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path ="/v2")
public class Status {

    @RequestMapping(path="/saveUser",method = RequestMethod.GET)
    @ResponseBody
    public String saveUser(@RequestParam (name = "firstName")String name,@RequestParam (name="age")int age){
        return "The userName is " + name+ " and age is :" + age;
    }

    @RequestMapping(path = "/fetchUser",method = RequestMethod.POST)
    @ResponseBody
    public String postName(){
    return "Successfully updated the details of the user";
    }

    @GetMapping(path="/responseEntity")
    public ResponseEntity<String> test(@RequestParam(name="name") String name){
        String output = "This is a ResponseEntity " +name ;
        return ResponseEntity.status(HttpStatus.OK).body(output);
    }
}
