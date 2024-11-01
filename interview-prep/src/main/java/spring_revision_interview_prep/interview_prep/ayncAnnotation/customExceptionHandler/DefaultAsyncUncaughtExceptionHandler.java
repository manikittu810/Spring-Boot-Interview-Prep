package spring_revision_interview_prep.interview_prep.ayncAnnotation.customExceptionHandler;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
public class DefaultAsyncUncaughtExceptionHandler implements AsyncUncaughtExceptionHandler {
    @Override
    public void handleUncaughtException(Throwable ex, Method method,Object... params){
        System.out.println("In Default Async Uncaught Exception method");
        //logging is done here
    }
}
