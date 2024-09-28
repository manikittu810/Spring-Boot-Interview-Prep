package spring_revision_interview_prep.interview_prep.dependencyInjection.fieldInjection;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Dependency {
    public Dependency(){
        System.out.println("Dependency Initialized");
    }
}
