package spring_revision_interview_prep.interview_prep.dependencyInjection.ConstructorInjection;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Dependency2 {
    public Dependency2(){
        System.out.println("Dependency 2 bean created ...Invoked by ConstructorInjection...");
    }
}
