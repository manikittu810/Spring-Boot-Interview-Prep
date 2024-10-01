package spring_revision_interview_prep.interview_prep.profiling;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class MySQLConnection1 {
    @Value("${username}")
     String username;

    @Value("${password}")
     String password;

    @PostConstruct
    public void print(){
        System.out.println("MySQL Username is  : " + username + "\nPassword is : " + password);
    }
}
