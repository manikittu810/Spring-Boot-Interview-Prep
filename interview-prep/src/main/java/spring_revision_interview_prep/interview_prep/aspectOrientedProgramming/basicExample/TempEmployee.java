package spring_revision_interview_prep.interview_prep.aspectOrientedProgramming.basicExample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("TEmployee")
public class TempEmployee implements IEmployee{
    @Override
    public void fetchEmployee() {
        System.out.println("in Temporary Employee Class");
    }
}
