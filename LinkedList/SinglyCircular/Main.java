package LinkedList.SinglyCircular;

public class Main {
    public static void main(String[] args) {
        CircularLL list = new CircularLL();
        list.insertBeg(30);
        list.show();
        list.insertBeg(40);
        list.show();
        list.insertBeg(50);
        list.show();
        list.insertLast(33);
        list.show();
        list.insertLast(44);
        list.show();
        list.insertLast(55);
        list.show();
        list.delBeg();
        list.show();
        list.delLast();
        list.show();

    }
}
