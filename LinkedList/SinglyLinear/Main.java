package LinkedList.SinglyLinear;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
//        list.insertBeg(3);
//        list.insertBeg(4);
//        list.insertBeg(5);
//        list.insertBeg(6);
        list.show();
        System.out.println("No of node = "+ list.count());
        list.insertLast(30);
        System.out.println("No of node = "+ list.count());
        list.insertLast(40);
        System.out.println("No of node = "+ list.count());
        list.insertLast(50);
        System.out.println("No of node = "+ list.count());
        list.insertFirst(1);
        System.out.println("No of node = "+ list.count());
        list.show();
        list.deleteFirst();
        list.show();
        System.out.println("No of node = "+ list.count());
        list.deleteLast();
        list.show();
        list.insertFirst(1);
        list.show();
        list.insertLast(68);
        list.show();
        list.search(68);
        list.search(69);
        System.out.println("No of node = "+ list.count());
        list.insertFirst(100);
        list.show();
        System.out.println("No of node = "+ list.count());
    }
}
