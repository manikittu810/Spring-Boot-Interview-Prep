package spring_revision_interview_prep.interview_prep.ayncAnnotation.customExceptionHandler;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class ExceptionTest{
    @Async
    public void performAsyncTest(){
        int i = 0;
        System.out.println(5/i);
    }
}
