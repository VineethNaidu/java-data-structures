package org.example.designpatterns.designprinciples;

/*
Open/Closed Principle (OCP)
    Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification.
    Eg: 1. Add a new feature
        2. Modify an existing feature
        3. Remove a feature (if needed)

    Real-Time Example:
        1. Suppose we have a DiscountCalculator class that calculates discounts for regular and premium customers.
           If we introduce a new VIP customer, we would need to modify the existing class.

    ✅ Fix:
        Create a new interface (IDiscountCalculator) and extend it for different discount types.
        Instead of modifying the class, create an interface and extend behavior using subclasses (RegularDiscount, PremiumDiscount, VIPDiscount).
*/

/*
    Bad Example: (Violates OCP)
    DiscountCalculator class modifies existing code every time a new discount type is added.

    class DiscountCalculator {
        public double calculateDiscount(double amount, String customerType) {
            if (customerType.equals("regular")) {
                return amount * 0.1;
            } else if (customerType.equals("premium")) {
                return amount * 0.2;
            } else {
                throw new IllegalArgumentException("Invalid customer type");
            }
        }
    }

    class Discount {
        public static void main(String[] args) {
            DiscountCalculator calculator = new DiscountCalculator();
            double discount = calculator.calculateDiscount(100, "regular");
            double discount = calculator.calculateDiscount(100, "premium");
            System.out.println("Discount: " + discount);
        }
    }

    Problems with this Approach
    ❌ Breaks OCP: Every time a new discount type (e.g., "VIP") is added, we have to modify the calculateDiscount method.
    ❌ Difficult to Maintain: If there are many discount types, the if-else chain will become unmanageable.
    ❌ Not Scalable: If multiple developers work on calculateDiscount, conflicts may occur.
 */


 /*
    Good Example (Follows OCP using Polymorphism)
    ✅ We introduce an interface (DiscountStrategy) and create separate classes for each discount type.
    ✅ Now, we extend functionality without modifying existing code.
 */

interface DiscountStrategy {
    double calculateDiscount(double amount);
}

class RegularDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.1;
    }
}

class PremiumDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.2;
    }
}

class VIPDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.3;
    }
}

class DiscountCalculator {
    private DiscountStrategy discountStrategy;

    public DiscountCalculator(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateDiscount(double amount) {
        return discountStrategy.calculateDiscount(amount);
    }
}

public class OpenClosedPrinciple {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator(new RegularDiscount());
        double regularDiscount = calculator.calculateDiscount(500);
        System.out.println("Regular Discount: " + regularDiscount);
        calculator = new DiscountCalculator(new VIPDiscount());
        double vipDiscount = calculator.calculateDiscount(500);
        System.out.println("VIP Discount: " + vipDiscount);
    }
}
