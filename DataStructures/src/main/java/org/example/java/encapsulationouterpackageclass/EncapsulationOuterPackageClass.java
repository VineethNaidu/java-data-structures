package org.example.java.encapsulationouterpackageclass;

import org.example.java.encapsulation.Encapsulation;

public class EncapsulationOuterPackageClass extends Encapsulation {
    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        EncapsulationOuterPackageClass encapsulationOuterPackageClass= new EncapsulationOuterPackageClass();

//      encapsulation Object - can't access protected member
        System.out.println("Outer Package Public Member: " + encapsulation.publicVariable);
//      System.out.println("Outer Package Private Member: " + encapsulation.privateVariable);
        System.out.println("Outer Package Private Member using instance: " + encapsulation.getPrivateVariable());
//      System.out.println("Outer Package Protected Member: " + encapsulation.protectedVariable);
//      System.out.println("Outer Package Default Member: " + encapsulation.defaultVariable);

//      encapsulationOuterPackageClass - can access protected member in package subclass
        System.out.println("Outer Package Public Member: " + encapsulationOuterPackageClass.publicVariable);
//      System.out.println("Outer Package Private Member: " + encapsulationOuterPackageClass.privateVariable);
        System.out.println("Outer Package Private Member using instance: " + encapsulationOuterPackageClass.getPrivateVariable());
        System.out.println("Outer Package Protected Member: " + encapsulationOuterPackageClass.protectedVariable);
//      System.out.println("Outer Package Default Member: " + encapsulationOuterPackageClass.defaultVariable);
    }
}
