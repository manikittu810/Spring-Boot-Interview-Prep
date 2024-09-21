package spring_revision_interview_prep.interview_prep.basicRestAPI;

import org.springframework.validation.DataBinder;
import org.springframework.web.bind.annotation.*;

import java.beans.PropertyEditorSupport;

@RestController
@RequestMapping(path="/api")
public class InitBinderImpl {
    @InitBinder
    public void initBinder(DataBinder binder){
        binder.registerCustomEditor(String.class,"firstName",new FirstNamePropertyEditor());
    }
    @GetMapping(path="/fetchNow")
    public String print(
            @RequestParam(name = "firstName") String firstName,
            @RequestParam(name = "lastName",required = false) String lastName,
            @RequestParam(name = "age") int age
    ){
        return "My name is " + firstName +" "+lastName +" and my age is " + age;

    }
}
class FirstNamePropertyEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text){
        setValue(text.trim().toLowerCase());
    }
}