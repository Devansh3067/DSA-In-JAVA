package OOPS;

//* Static things do not depend upon objects.

public class LearnStatic {
    public static void main(String[] args) {
        Human devansh = new Human(19, "Devansh", 150000, false);
        Human happy = new Human(18, "Happy", 150, true);

//        System.out.println(happy.population);
//        System.out.println(devansh.population); // It gives two for both

        System.out.println(Human.population);

        int x = Math.max(2,3); //This is a function, it is static, thus we call it without an object.
        String str = "Devansh";
        int y = str.length();//This is a method, it cannot be called without object or instance.

        happy.exampleFunc();
    }
}

class Human {
    int age;
    String name;
    int salary;
    boolean engaged;
    static long population; //* Population is static as it does not depend on individual human(object) and it is same for all. Static things does not depend upon objects

    public Human(int age, String name, int salary, boolean engaged) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.engaged = engaged;
        Human.population += 1;
    }
    void exampleFunc(){
        System.out.println(this.name);
        exampleFunc2();
    }
    void exampleFunc2(){
        System.out.println(this.name);
    }
}
