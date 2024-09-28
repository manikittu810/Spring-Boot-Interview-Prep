package spring_revision_interview_prep.interview_prep.dependencyInjection.ConstructorInjection;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Invoice {

    public Invoice(){
        System.out.println("This is from Bean Invoice.....");
    }
}
