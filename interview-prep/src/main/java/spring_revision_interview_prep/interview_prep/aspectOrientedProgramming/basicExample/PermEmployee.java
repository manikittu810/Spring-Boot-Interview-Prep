package spring_revision_interview_prep.interview_prep.aspectOrientedProgramming.basicExample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PEmployee")
public class PermEmployee implements IEmployee{
    @Override
    public void fetchEmployee(){
        System.out.println("in Permanent Employee Class");
    }
}

