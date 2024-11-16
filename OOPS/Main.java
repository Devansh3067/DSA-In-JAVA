package OOPS;

public class Main {
    public static void main(String[] args) {
        Student devansh = new Student("Devansh", 33, 87);// Using constructor to assign values to the object
        Student jesus = new Student("jesus", 2, 53);// Using constructor to assign values to the object
//        devansh.name = "Devansh";
//        devansh.rollNo = 1;
//        devansh.marks = 100;
        System.out.println(devansh.name);
        System.out.println(devansh.rollNo);
        System.out.println(devansh.marks);
        devansh.inc(20);
        devansh.sayHello();
        jesus.sayHello();
        System.out.println(devansh.marks);

        Student happy = new Student(jesus);
        System.out.println(happy.marks);
        System.out.println(happy.name);
        System.out.println(happy.rollNo);

        jesus.name = "neew";
        System.out.println(jesus.name); // Jesus name gets changed but the happy name does not change...
        System.out.println(happy.name);

        Student one = new Student("One",1,1.1f);
        Student two = one;
        System.out.println(two.name);
    }
}

class Student {
    String name;
    int rollNo;
    float marks;

    Student(String name, int rollNo, float marks) {
//        name = name; // if we write directly it does not work, as both name variable are treated as in argument.
        this.name = name; // Here this keyword comes into to play.
        this.rollNo = rollNo;
        this.marks = marks;
    }

    Student(Student other) {
        this.name = other.name;
        this.marks = other.marks;
        this.rollNo = other.rollNo;
    }

    void sayHello() {
        System.out.println("hello " + name);
    }

    void inc(int inc) {
        marks += inc;
    }
}
