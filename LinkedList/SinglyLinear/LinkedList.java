package LinkedList.SinglyLinear;

public class LinkedList {

    private Node head;
    private Node tail;

    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        size++;
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
    }

    public void insertLast(int value){
        size++;
        Node node = new Node(value,null);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        tail = node;
    }

    public void deleteFirst(){
        size--;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    public void deleteLast(){
        size--;
        if(head == null){
            System.out.println("The list is already empty");
            return;
        }
        Node temp = head;
        Node trav = head;
        while(temp.next != null){
            trav = temp;
            temp = temp.next;
        }
        trav.next = null;
        tail = trav;
    }

    public void search(int target){
        Node temp = head;
        while(temp!=null){
            if(temp.value == target){
                System.out.println("Node found");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Node not found");
    }

    public int count(){
//        int counter = 0;
//        Node temp = head;
//        while(temp != null){
//            counter++;
//            temp = temp.next;
//        }
        return size;
    }

    public void show(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value);
            temp = temp.next;
            if(temp != null){
                System.out.print("-->");
            }
        }
        System.out.println();
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
