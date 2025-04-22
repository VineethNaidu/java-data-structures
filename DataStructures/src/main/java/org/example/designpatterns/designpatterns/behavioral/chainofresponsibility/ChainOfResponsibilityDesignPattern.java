package org.example.designpatterns.designpatterns.behavioral.chainofresponsibility;

// Client Code
public class ChainOfResponsibilityDesignPattern {
    public static void  main(String[] args) {

        Approver manager = new Manager();
        Approver director = new Director();
        Approver ceo = new CEO();

        //Establish Chain
        manager.setNextApprover(director);
        director.setNextApprover(ceo);

        // Request
        PurchaseRequest request = new PurchaseRequest(60000, "Project X");
        manager.approve(request);

        request = new PurchaseRequest(40000, "Project Y");
        manager.approve(request);

        request = new PurchaseRequest(5000, "Project Z");
        manager.approve(request);
    }

}

/*
Definition:
    1. COR Design Pattern allows an object to pass a request along a chain of handlers until one of them handles the request.
    2. Each handler can either handle the request or pass it to the next handler in the chain.

Characteristics:
    1. Loose Coupling: Sender of a request doesn't need to know which handler handles the request.
    2. Dynamic Chain: While the program is running, changing the chain is simple. This makes your code incredibly flexible because you may add or delete handlers without changing the main body of the code.
    3. Single Responsibility: Each handler handles one part of the request.
    4. Sequential Order: The handlers are executed in a sequence, one after another.
    5. Fallback Mechanism: You can set a fallback handler that handles the request if no other handler handles it.

Components:
    1. Handler Interface: Base class that defines the interface for handling requests and, in many cases, for chaining to the next handler in the sequence.
    2. Concrete Handler: It implements how the requests are handles and passes them to the next handler in the chain.
    3. Client: The object that sends a request to the handler.
    4. Request: The object that contains the request data.
 */
