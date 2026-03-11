package Programs.OOP;

class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("Person Constructor: Name = " + name + ", Id = " + id);
    }
}

class Employee extends Person {

    Employee(String name, int id) {
        super(name, id);
        System.out.println("Employee Constructor Executed");
    }
}

public class ThisAndSuper {

    public static void main(String[] args) {
        Person person = new Employee("Saurabh", 501);
    }
}
