package spring_revision_interview_prep.interview_prep.dependencyInjection.ConstructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ContructorInjection {
    Dependency2 dependency2;
    Invoice invoice;
    NewOrder newOrder;
    @Autowired
    public ContructorInjection(Dependency2 dependency2){
        this.dependency2 = dependency2;
        System.out.println("ConstructorInjection bean created.......");
    }

    @Autowired
    public void printInvoice(Invoice invoice){
        this.invoice = invoice;
    }

    @Autowired
    public void printNewOrder(NewOrder newOrder){
        this.newOrder=newOrder;
    }
}
