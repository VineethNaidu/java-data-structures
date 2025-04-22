package org.example.designpatterns.designpatterns.behavioral.chainofresponsibility;

// Handler Interface/Abstract Class (Manager, Director, CEO)
public abstract class Approver {
    protected Approver nextApprover;

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    public abstract void approve(PurchaseRequest request);
}
