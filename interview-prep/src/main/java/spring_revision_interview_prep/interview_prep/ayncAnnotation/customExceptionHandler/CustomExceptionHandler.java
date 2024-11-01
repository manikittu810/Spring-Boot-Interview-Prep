package spring_revision_interview_prep.interview_prep.ayncAnnotation.customExceptionHandler;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;

@Configuration
public class CustomExceptionHandler implements AsyncConfigurer {
    @Autowired
    private AsyncUncaughtExceptionHandler asyncUncaughtExceptionHandler;

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler(){
    return this.asyncUncaughtExceptionHandler;
}

}
