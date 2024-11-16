package OOPS;

public class GarbageCollector {
    public static void main(String[] args) {
        demo obj;
        for (int i = 0; i < 1000000; i++) { // When we run this loop.... each time a new object is created, and it gets pointed by ref variable obj, and the previous objects will have no reference variable. Thus, they will be destroyed by the garbage collector as the finalize method will be called, and we see the message of the object destroyed.
            //Note the message will not be displayed when we make about 1K - 2K objects as then there will be no load on the memory.
            obj = new demo("Random text");
        }
    }
}

class demo {
    final int num = 10;
    String name;

    demo(String name) {
//        System.out.println("New Object Created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object destroyed");
    }
}
