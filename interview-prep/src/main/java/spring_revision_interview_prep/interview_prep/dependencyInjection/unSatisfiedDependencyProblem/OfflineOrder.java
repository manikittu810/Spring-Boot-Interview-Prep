package spring_revision_interview_prep.interview_prep.dependencyInjection.unSatisfiedDependencyProblem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
//@Qualifier("OfflineOrder") commented for the second solution
public class OfflineOrder implements Order{
    public OfflineOrder(){
        System.out.println("OfflineOrder Bean Created....");
    }
    @Override
    public void createOrder(){
        System.out.println("OfflineOrder Created....");
    }
}
