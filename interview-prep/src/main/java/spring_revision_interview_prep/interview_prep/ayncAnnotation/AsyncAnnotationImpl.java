package spring_revision_interview_prep.interview_prep.ayncAnnotation;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/")
public class AsyncAnnotationImpl {
    AsyncUserService userService;

    public  AsyncAnnotationImpl(AsyncUserService userService){
        this.userService = userService;
    }

    @GetMapping(path="/get-async")
    public ResponseEntity<String> asyncService(){
        System.out.println("From asyncService : " + Thread.currentThread().getName());
        userService.asyncUserService();
        return ResponseEntity.status(HttpStatus.OK).body("This from Async Thread : " + Thread.currentThread().getName());
    }
}
