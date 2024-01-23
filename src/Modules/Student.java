package Modules;

public class Student extends Person {
    private double gpa;
    private double salary;
    public Student() {

    }
    public Student(String name, String surname, double gpa) {
        super(name, surname); // making it super class to convert to string in future
        setGpa(gpa);
        setSalary(salary);
        setPosition("Student"); // creating student data and adding it
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = getPaymentAmount();
    }

    @Override
    public double getPaymentAmount() {
        double min = 3.6;
        if (gpa > min) {
            return 36600.00;
        }
        else {
            return 0;
        } // calling to getPaymentAmount func and checking if students gpa > 3.6 to give him stipendia
    }

    @Override
    public String toString() {
        return super.toString() + " earns " + getPaymentAmount() + " tenge";
    }// calling toString method from superclass and adding our data from class Student as salary name etc. to output it in future
}
