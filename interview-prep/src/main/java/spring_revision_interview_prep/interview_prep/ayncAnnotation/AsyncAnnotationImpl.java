package spring_revision_interview_prep.interview_prep.ayncAnnotation;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring_revision_interview_prep.interview_prep.ayncAnnotation.customExceptionHandler.ExceptionTest;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping(path="/api/")
public class AsyncAnnotationImpl {
    AsyncUserService userService;
    ExceptionTest exceptionTest;

    public  AsyncAnnotationImpl(AsyncUserService userService,ExceptionTest exceptionTest){
        this.userService = userService;
        this.exceptionTest=exceptionTest;
    }

    @GetMapping(path="/get-async")
    public ResponseEntity<String> asyncService(){
        System.out.println("From asyncService : " + Thread.currentThread().getName());
        userService.asyncUserService();
        return ResponseEntity.status(HttpStatus.OK).body("This from Async Thread : " + Thread.currentThread().getName());
    }
    @GetMapping(path="/get-async1")
    public String asyncService1(){
        CompletableFuture<String> res= userService.performAsync();
        String ans = null;
        try{
            ans = res.get();
            System.out.println(ans);
        }catch(InterruptedException | ExecutionException ignored){
        }
        return ans;
    }
@GetMapping(path="/e")
    public ResponseEntity<Void> method(){
        exceptionTest.performAsyncTest();
        return ResponseEntity.status(HttpStatus.OK).build();
}

}
