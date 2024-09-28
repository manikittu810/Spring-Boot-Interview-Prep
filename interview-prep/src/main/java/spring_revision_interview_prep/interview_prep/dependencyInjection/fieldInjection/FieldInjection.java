package spring_revision_interview_prep.interview_prep.dependencyInjection.fieldInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FieldInjection {
    @Autowired
    Dependency dependency;
    public FieldInjection(){
        System.out.println("FieldInjection initialized");
    }



}
