import Modules.Person;
import Modules.Student;
import Modules.Employee;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee("John", "Lennon", 27045.78);
        Employee emp2 = new Employee("George", "Harrison", 50000.00);
        Student stu1 = new Student("Azamat", "Sailaubek", 4.0);
        Student stu2 = new Student("Kirill", "Rozhkov", 3.7);

        ArrayList<Person> humans = new ArrayList<>(); // creating some list in order to add our data here

        humans.add(emp1);
        humans.add(emp2);
        humans.add(stu1);
        humans.add(stu2);

        Collections.sort(humans); // sorting out list

        printData(humans); // calling printData method below
    }

    public static void printData(Iterable<Person> humans) {
        for (Person person: humans) {
            System.out.println(person.toString()); // outputing every person information from the list
        }
    }
}