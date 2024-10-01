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
    //if you don't declare the required on the side of the @Autowired then it is automatically assigns true
//    required = false , in the @Autowired tells the springboot is that, resolve the dependency if it is true, otherwise make the dependency null and move forward
//    how it knows whether it is true or not?
    // if you declare something about the dependency in application.properties as true with key as prefix.Value and values as havingValue attributes from the @conditionalOnProperty and
//    the bean is only created when the springboot finds this in the application.properties and makes the matchIfMissing !=false and then bean gets created otherwise as mentioned in the
     //@Autowired (required = false) , it just skips the creation of bean and assigns the bean object to null and tries to resolve the other dependencies

    @PostConstruct
    public void print(){
        System.out.println("*********************************************************************************");
        System.out.println("DBConnection Bean created with dependencies below : ");
        System.out.println("is MySQLConnection object is null ?? : "+Objects.isNull(mySQLConnection));
        System.out.println("is noSQLConnection object is null ?? : "+Objects.isNull(noSQLConnection));
        System.out.println("*********************************************************************************");

    }

}
