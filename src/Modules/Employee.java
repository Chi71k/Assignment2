package Modules;

public class Employee extends Person {
    private double salary;
    public Employee(){

    }

    public Employee(String name, String surname, double salary) {
        super(name, surname); // making it super class to convert to string in future
        setPosition("Employee");
        setSalary(salary);
    }

    @Override
    public double getPaymentAmount() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + " earns " + getPaymentAmount() + " tenge";
    }// calling toString method from superclass and adding our data from class Employee as salary name etc. to output it in future
}