package spring_revision_interview_prep.interview_prep.dependencyInjection.setterInjection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterInjection {
    Dependency1 dependency1;
    public SetterInjection(){
        System.out.println("Setter Injection Bean created....");
    }

    @Autowired
    public void print(Dependency1 dependency1){
        this.dependency1 = dependency1;
    }
}
