package spring_revision_interview_prep.interview_prep.dependencyInjection.ConstructorInjection;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class NewOrder {
    public NewOrder(){
        System.out.println("This is from Bean NewOrder....");
    }
}
