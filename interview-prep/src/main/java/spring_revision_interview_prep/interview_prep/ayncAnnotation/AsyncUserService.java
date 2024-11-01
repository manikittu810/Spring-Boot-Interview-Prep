package spring_revision_interview_prep.interview_prep.ayncAnnotation;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

@Component
public class AsyncUserService {
    @Async("myThreadPoolExecutor")
    public void asyncUserService(){
        System.out.println("This is from Async MethodTest : " + Thread.currentThread().getName());
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Async
    public CompletableFuture<String> performAsync(){
        return CompletableFuture.completedFuture("Async Task result");
    }
}
