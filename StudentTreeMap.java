package apjfsa;

import java.util.TreeMap;

public class StudentTreeMap {
    public static void main(String[] args) {
        // Creating a TreeMap to store students with roll numbers as keys
        TreeMap<Integer, Student> students = new TreeMap<>();

        // Adding students to the TreeMap
        students.put(101, new Student("Alice", 20));
        students.put(102, new Student("Bob", 22));
        // Add more students with their roll numbers here
        students.put(103, new Student("Charlie", 21));
        students.put(104, new Student("Diana", 23));

        // Display the TreeMap
        System.out.println("Students: " + students);
    }
}

class Student {
    private String name;
    private int age;

    // Constructor to initialize Student object
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Overriding toString() method for better display of Student objects
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}
