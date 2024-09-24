package spring_revision_interview_prep.interview_prep.beanInitialization;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class Order {
    public Order(){
        System.out.println("Lazy : Initializing order");
    }
}
