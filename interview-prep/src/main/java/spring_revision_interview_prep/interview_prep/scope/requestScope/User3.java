package spring_revision_interview_prep.interview_prep.scope.requestScope;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("request")
public class User3 {
    public User3(){
        System.out.println("Bean Created for User3 of scope Request");
    }

    @PostConstruct
    public void init(){
        System.out.println("HashCode for User3 of scope request : " + this.hashCode());
    }
}
