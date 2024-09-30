package spring_revision_interview_prep.interview_prep.conditionalOnProperty;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class DBConnection {
    @Autowired(required = false)
    MySQLConnection mySQLConnection;
    @Autowired(required = false)
    NoSQLConnection noSQLConnection;

    @PostConstruct
    public void print(){
        System.out.println("*********************************************************************************");
        System.out.println("DBConnection Bean created with dependencies below : ");
        System.out.println("is MySQLConnection object is null ?? : "+Objects.isNull(mySQLConnection));
        System.out.println("is noSQLConnection object is null ?? : "+Objects.isNull(noSQLConnection));
        System.out.println("*********************************************************************************");

    }

}
