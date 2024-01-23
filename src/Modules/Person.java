package Modules;

public class Person implements Payable, Comparable<Person> {
    private int id;
    private static int id_gen = 1;
    private String name;
    private String surname;
    private String position; // inputting all necessary data

    public Person() {
        id = id_gen++;
    }
    public Person(String name, String surname) {
        this();
        setName(name);
        setSurname(surname);
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public int compareTo(Person o) {
        return Double.compare(this.getPaymentAmount(), o.getPaymentAmount()); // comparing current and next data to sort it
    }

    @Override
    public double getPaymentAmount() {
        return 0;
    }
    @Override
    public String toString() {
        return getPosition() + ": " + getId() + ". " + getName() + " " + getSurname();
    } // method which will be called in other classes to output data in such form
}
