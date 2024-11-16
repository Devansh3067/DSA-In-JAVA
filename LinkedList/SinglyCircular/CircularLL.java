package LinkedList.SinglyCircular;

public class CircularLL {

    private Node head;
    public int size;

    void insertBeg(int value){
        Node node = new  Node(value);
        node.next = node;
        size++;
        if(head == null){
            head = node;
            return;
        }
        Node temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        node.next = head;
        head= node;
        temp.next = head;
    }

    void insertLast(int value){
        Node node = new Node(value);
        node.next = head;
        size++;
        if(head == null){
            head = node;
            return;
        }
        Node temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        temp.next = node;
    }

    void delBeg(){
        size--;
        if(head == null){
            System.out.println("The list in Empty.");
            return;
        }
        Node temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        head = head.next;
        temp.next = head;
    }

    void delLast(){
        size--;
        if(head == null){
            System.out.println("The list is Empty.");
            return;
        }
        Node temp = head;
        Node trav = head;
        while(temp.next != head){
            trav = temp;
            temp = temp.next;
        }
        trav.next = head;
    }

    void search(int target){
        Node temp = head;
        while(temp.next != head){
            if(temp.value == target){
                System.out.println("Target found");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Target not found");
    }

    void show(){
        Node temp = head;
        while(temp.next != head){
            System.out.print(temp.value + " ---> ");
            temp = temp.next;
        }
        System.out.println(temp.value + " ---> HEAD");
    }

    private class Node {
        private int value;
        private Node next;

        Node(int value){
            this.value = value;
        }
    }
}
