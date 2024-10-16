package spring_revision_interview_prep.interview_prep.aspectOrientedProgramming.basicExample;

import org.springframework.stereotype.Component;

@Component
public class EmployeeUtil {
    public void employeeHelper(){
        System.out.println("EmployeeUtil method invoked after Interception");
    }
}
