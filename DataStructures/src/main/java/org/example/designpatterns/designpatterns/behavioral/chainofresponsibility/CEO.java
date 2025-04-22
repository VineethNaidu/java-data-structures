package org.example.designpatterns.designpatterns.behavioral.chainofresponsibility;

// Concrete Handler
public class CEO extends Approver {

    @Override
    public void approve(PurchaseRequest request) {
        if (request.getAmount() > 50000) {
            System.out.println("CEO approved purchase request of $ " + request.getAmount());
        } else if(nextApprover != null) {
            nextApprover.approve(request);
        }
    }
}
