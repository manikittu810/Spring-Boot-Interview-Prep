package spring_revision_interview_prep.interview_prep.conditionalOnProperty;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix="NoSQLCon",value = "enabled",havingValue="true",matchIfMissing = false)
public class NoSQLConnection {

    public NoSQLConnection(){
        System.out.println("NoSQLConnection established.....");
    }
}
