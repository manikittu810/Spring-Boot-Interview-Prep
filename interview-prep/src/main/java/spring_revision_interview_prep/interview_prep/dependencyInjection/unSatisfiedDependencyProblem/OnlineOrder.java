package spring_revision_interview_prep.interview_prep.dependencyInjection.unSatisfiedDependencyProblem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
//@Qualifier("OnlineOrder") commented for the 2nd solution
public class OnlineOrder implements  Order{
    public OnlineOrder(){
        System.out.println("OnlineOrder Bean Created....");
    }
    @Override
    public void createOrder(){
        System.out.println("OnlineOrder Created....");
    }
}
