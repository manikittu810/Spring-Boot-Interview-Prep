package spring_revision_interview_prep.interview_prep.dependencyInjection.unSatisfiedDependencyProblem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class Customer {
    @Autowired
    @Qualifier("OnlineOrder")
    Order order;

    @PostMapping(path = "/createOrder")
    public ResponseEntity<String> createOrder(){
        order.createOrder();
        return ResponseEntity.status(HttpStatus.OK).body("Order Created...");
    }
}
