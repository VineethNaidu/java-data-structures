package org.example.designpatterns.designpatterns.behavioral.chainofresponsibility;

// Concrete Handler
public class Director extends Approver {

    @Override
    public void approve(PurchaseRequest request) {
        if (request.getAmount() < 50000.0) {
            System.out.println("Director approved purchase request of $" + request.getAmount());
        } else if(nextApprover != null) {
            nextApprover.approve(request);
        }
    }
}
