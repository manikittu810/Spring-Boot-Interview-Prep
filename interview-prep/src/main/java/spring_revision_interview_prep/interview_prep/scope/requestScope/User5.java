package spring_revision_interview_prep.interview_prep.scope.requestScope;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;


@Component
@Scope(value="request",proxyMode= ScopedProxyMode.TARGET_CLASS)
public class User5 {
    public User5(){
        System.out.println("Bean Created for User5 of scope Request");
    }

    @PostConstruct
    public void init(){
        System.out.println("HashCode for User5 of scope request : " + this.hashCode());
    }
    public boolean  dummyMethod(){
       return true;
    }

}