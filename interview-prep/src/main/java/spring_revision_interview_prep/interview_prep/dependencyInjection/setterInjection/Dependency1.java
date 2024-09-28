package spring_revision_interview_prep.interview_prep.dependencyInjection.setterInjection;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Dependency1 {
    public Dependency1(){
        System.out.println("Dependency1 for Setter Injection Bean Created....");
    }
}