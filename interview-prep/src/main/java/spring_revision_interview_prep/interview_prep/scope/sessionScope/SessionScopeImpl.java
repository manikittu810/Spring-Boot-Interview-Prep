package spring_revision_interview_prep.interview_prep.scope.sessionScope;

import jakarta.annotation.PostConstruct;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope("session")
@RequestMapping("/test-scope")
public class SessionScopeImpl {

    @Autowired
    SomeUser user;
    public SessionScopeImpl(){
        System.out.println("SessionScopeImpl class Bean created.....");
    }

    @PostConstruct
    public void init(){
        System.out.println("Hashcode for SessionScopeImp Bean is : " + this.hashCode()+
                "\nHasCode for user is Bean autowire with Session class is : " + user.hashCode());
    }
    @GetMapping(path="/test6")
    public ResponseEntity<String> print(){
        System.out.println("Session class API invoked....");
        return ResponseEntity.status(HttpStatus.OK).body("Session API working Successfully");
    }

    //Terminating an HttpSession
    @GetMapping(path="end")
    public ResponseEntity<String> endSession(HttpServletRequest request){
        System.out.println("Ending the Session......");
        HttpSession session = request.getSession();
        session.invalidate();
        return ResponseEntity.status(HttpStatus.OK).body("Session ended Successfully......");

    }
}
