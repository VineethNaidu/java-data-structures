package org.example.designpatterns.designprinciples;

/*
Single Responsibility Principle (SRP)
    A class should have only one reason to change.
    This means that each class should have a single, well-defined responsibility.
*/

/*
    Bad Example (Violates SRP)
    The Employee class handles multiple responsibilities:
        Storing employee details
        Calculating salary
        Saving employee details to a database

    class Employee {
        private String name;
        private double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        // Responsibility 1: Employee details
        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        // Responsibility 2: Salary calculation (violates SRP)
        public double calculateBonus() {
            return salary * 0.1; // 10% bonus
        }

        // Responsibility 3: Saving employee details (violates SRP)
        public void saveToDatabase() {
            System.out.println("Saving " + name + " to the database...");
        }
    }

 */

/*
    Good Example (Follows SRP)
    We separate concerns into three different classes:
        Employee → Manages only employee details.
        SalaryCalculator → Handles salary calculations.
        EmployeeRepository → Handles database operations.
*/

// Class 1: Holds employee data
class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

// Class 2: Handles salary calculations
class SalaryCalculator {
    public double calculateBonus(Employee employee) {
        return employee.getSalary() * 0.1;
    }
}

// Class 3: Handles database operations
class EmployeeRepository {
    public void saveToDatabase(Employee employee) {
        System.out.println("Saving " + employee.getName() + " to the database...");
    }
}

public class SingleResponsibilityPriniciple {
    public static void main(String[] args) {
        Employee emp = new Employee("John", 50000);

        SalaryCalculator calculator = new SalaryCalculator();
        double bonus = calculator.calculateBonus(emp);
        System.out.println("Bonus: " + bonus);

        EmployeeRepository repository = new EmployeeRepository();
        repository.saveToDatabase(emp);
    }
}

/*
Why This Follows SRP?
    ✅ Each class has a single responsibility:
        Employee only stores data.
        SalaryCalculator only calculates salary.
        EmployeeRepository only handles database operations.
    ✅ Easier to Maintain & Modify:
        If bonus calculations change, update SalaryCalculator only.
        If we change how we store employees, update EmployeeRepository only.
    ✅ Scalable & Reusable:
        We can reuse SalaryCalculator for different employees.
        We can extend EmployeeRepository to save employees to a file or cloud.
*/