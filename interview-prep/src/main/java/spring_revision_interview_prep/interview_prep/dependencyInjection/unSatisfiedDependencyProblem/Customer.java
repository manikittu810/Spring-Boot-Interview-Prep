package spring_revision_interview_prep.interview_prep.dependencyInjection.unSatisfiedDependencyProblem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class Customer {
    //Normal Solution
//    @Autowired
//    @Qualifier("OnlineOrder")
//    Order order;

    //Below is the Industry Standard -> Based on Client Value;
    @Qualifier("OnlineOrder")
    @Autowired
     Order onlineOrder;

    @Qualifier("OfflineOrder")
    @Autowired
    Order offlineOrder;



//    @PostMapping(path = "/createOrder")
//    public ResponseEntity<String> createOrder(){
//        order.createOrder();
//        return ResponseEntity.status(HttpStatus.OK).body("Order Created...");
//    }
@PostMapping(path = "/createOrder")
public ResponseEntity<String> createOrder(@RequestParam boolean isOnlineOrder){
    if(isOnlineOrder){
        onlineOrder.createOrder();
    }else{
        offlineOrder.createOrder();
    }

    return ResponseEntity.status(HttpStatus.OK).body("Order Created...");
}
}
