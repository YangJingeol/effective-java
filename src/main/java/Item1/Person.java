package Item1;

public class Person {
    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
    }

    public static Person personsName(String name) {
        return new Person(name);
    }
}
