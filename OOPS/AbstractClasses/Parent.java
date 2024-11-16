package OOPS.AbstractClasses;

//* We use the abstract classes in java. Abstract classes provide a template, and the child classes can use that template and fill in its own values or data.

public abstract class Parent {
    int age;
    abstract void career();
    abstract void partner();
    static void hello(){
        System.out.println("Hello from parent class");
    }
    public void about(){
        System.out.println("Our family has two children classes");
    }
}
