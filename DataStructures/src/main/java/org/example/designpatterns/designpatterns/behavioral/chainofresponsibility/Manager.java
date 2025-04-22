package org.example.designpatterns.designpatterns.behavioral.chainofresponsibility;

// Concrete Handler
public class Manager extends Approver {

    @Override
    public void approve(PurchaseRequest request) {
        if (request.getAmount() < 10000) {
            System.out.println("Manager approved purchase request of $" + request.getAmount() + ".");
        } else if(nextApprover != null) {
            nextApprover.approve(request);
        }
    }
}
