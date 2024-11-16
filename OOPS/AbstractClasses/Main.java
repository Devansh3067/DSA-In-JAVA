package OOPS.AbstractClasses;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(21);
        Daughter dau = new Daughter(20);

        son.career();
        son.partner();
        dau.career();
        dau.partner();

        System.out.println("-----About-----");
        son.about();// Son does not have an about class. Thus, it calls the about class of Parent.
        dau.about();

        Parent.hello();
    }
}
