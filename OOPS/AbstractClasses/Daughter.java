package OOPS.AbstractClasses;

public class Daughter extends Parent{
    Daughter(int age) {
        this.age = age;
    }

    @Override
    void career() {
        System.out.println("I want to become a doctor");
    }

    @Override
    void partner() {
        System.out.println("I love John");
    }

    public void about() {
        System.out.println("Hello I am Daughter Class.\nI am "+this.age);
    }
}
