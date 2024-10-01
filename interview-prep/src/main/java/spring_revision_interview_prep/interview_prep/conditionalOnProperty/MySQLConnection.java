package spring_revision_interview_prep.interview_prep.conditionalOnProperty;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix="mysqlcon",value = "enabled",havingValue="true",matchIfMissing = false)
public class MySQLConnection {
    public MySQLConnection(){
        System.out.println("MySQLConnection established.....");
    }
}
