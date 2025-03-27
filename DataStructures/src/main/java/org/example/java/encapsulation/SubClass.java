package org.example.java.encapsulation;

public class SubClass extends Encapsulation {

    //Instance Variables
    public String publicSubClassVariable = "Subclass Public";
    private String privateSubClassVariable = "Subclass Private";
    protected String protectedSubClassVariable = "Subclass Protected";
    String defaultSubClassVariable = "Subclass Package Private";

    public static void main(String[] args) {

        Encapsulation encapsulation = new Encapsulation();

        System.out.println("Super Class Public Variable: " + encapsulation.publicVariable);
//      System.out.println("Super Class Private Variable: " + encapsulation.privateVariable);
        System.out.println("Super Class Private Variable with instance method Using Object: "
                + encapsulation.getPrivateVariable());
        System.out.println("Super Class Protected Variable: " + encapsulation.protectedVariable);
        System.out.println("Super Class Default Variable: " + encapsulation.defaultVariable);

        SubClass subClass = new SubClass();

        // Retrieve SuperClass Variables with SubClass Instance
        System.out.println("Super Class Public Variable with Child Object: " + subClass.publicVariable);
//      System.out.println("Super Class Private Variable with Child Object: " + subClass.privateVariable);
        System.out.println("Super Class Private Variable with Child Object using instance method: " + subClass.getPrivateVariable());
        System.out.println("Super Class Protected Variable with Child Object: " + subClass.protectedVariable);
        System.out.println("Super Class Default Variable with Child Object: " + subClass.defaultVariable);

        // Retrieve SubClass Variables with SubClass Instance
        System.out.println("Sub Class Public Variable with Child Object: " + subClass.publicSubClassVariable);
        System.out.println("Sub Class Private Variable with Child Object: " + subClass.privateSubClassVariable);
        System.out.println("Sub Class Protected Variable with Child Object: " + subClass.protectedSubClassVariable);
        System.out.println("Sub Class Default Variable with Child Object: " + subClass.defaultSubClassVariable);
    }
}

