package OOPS.AbstractClasses;

public class Son extends Parent {
    Son(int age) {
        this.age = age;
    }


    @Override
    void career() {
        System.out.println("I want to become an engineer");
    }

    @Override
    void partner() {
        System.out.println("I love Alice");
    }


}
