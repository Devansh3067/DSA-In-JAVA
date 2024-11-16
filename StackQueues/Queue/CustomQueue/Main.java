package StackQueues.Queue.CustomQueue;

public class Main {
    public static void main(String[] args) throws Exception {
        SQueue q = new SQueue(5);
//        System.out.println(q.insert(20));
//        System.out.println(q.insert(30));
//        System.out.println(q.insert(30));
//        System.out.println(q.insert(30));
//        System.out.println(q.insert(30));
//        System.out.println(q.insert(30));
//
//        System.out.println(q.remove());
//        System.out.println(q.remove());
//        System.out.println(q.remove());
//        System.out.println(q.remove());
//        System.out.println(q.remove());
//        System.out.println(q.remove());

        SCircularQueue que1 = new SCircularQueue(3);
        System.out.println(que1.insert(20));
        System.out.println(que1.insert(30));
        System.out.println(que1.insert(40));
        que1.print();
//        System.out.println(que1.insert(30));

        System.out.println(que1.remove());
        System.out.println(que1.remove());
        que1.print();
//        System.out.println(que1.remove());

        System.out.println(que1.insert(50));
        que1.print();

        System.out.println(que1.remove());
        System.out.println(que1.remove());
        que1.print();
    }
}
