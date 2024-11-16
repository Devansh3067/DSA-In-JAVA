package LinkedList.DoublyLinear;

public class DoublyLL {

    private Node head;
    private Node tail;

    public int size;

    DoublyLL() {
        this.size = 0;
    }

    void insertBeg(int value) {
        size++;
        Node node = new Node(value, null, null);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
    }

    void insertLast(int value){
        size++;
        Node node = new Node(value, null, null);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
        tail = node;
    }

    void customInsert(int target, int value){
        // to insert a new node after a particular node whose value is target.
        Node node = new Node(value, null, null);
        Node temp = head;
        while(temp != null){
            if(temp.value == target){
                node.next = temp.next;
                if(node.next != null){
                    node.next.prev = node;
                }
                node.prev = temp;
                temp.next = node;
                return;
            }
            temp = temp.next;
        }
        System.out.println("The entered node not found");
    }

    void deleteBeg(){
        size--;
        if(head == null){
            System.out.println("The list is Empty");
            return;
        }
        if(head==tail){
            head = null;
            tail = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    void deleteLast(){
        size--;
        if(head == null){
            System.out.println("The list is Empty.");
            return;
        }
        if(head == tail){
            head = null;
            tail = null;
            return;
        }
        tail.prev.next = null;
    }

    void search(int value){
        Node temp = head;
        while(temp != null){
            if(temp.value == value){
                System.out.println("The searched node is present");
                return;
            }
            temp = temp.next;
        }
        System.out.println("The node not found.");
    }

    void show() {
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ↔ ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    void showRev() {
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.value + " ↔ ");
            temp = temp.prev;
        }
        System.out.println("End");
    }

    private static class Node {
        int value;
        Node prev;
        Node next;

        Node(int value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }
}
