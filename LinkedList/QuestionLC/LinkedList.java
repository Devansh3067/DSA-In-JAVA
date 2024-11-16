package LinkedList.QuestionLC;

public class LinkedList {

    private Node head;
    private Node tail;

    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public void insert(int value){
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

    public static LinkedList mergeTwoLists(LinkedList list1, LinkedList list2) {
        LinkedList ans = new LinkedList();

        Node first = list1.head;
        Node second = list2.head;

        while(first != null && second != null){
            if(first.value <= second.value){
                ans.insert(first.value);
                first = first.next;
            }
            else {
                ans.insert(second.value);
                second = second.next;
            }
        }
        while(first != null){
            ans.insert(first.value);
            first= first.next;
        }

        while(second != null){
            ans.insert(second.value);
            second = second.next;
        }
        return ans;
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

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        LinkedList list3 = new LinkedList();
        list1.insert(1);
        list1.insert(2);
        list1.insert(4);
        System.out.print("List 1 = ");
        list1.show();

        list2.show();
        list2.insert(1);
        list2.insert(3);
        list2.insert(4);
        System.out.print("List 2 = ");
        list2.show();

        System.out.print("Merged list = ");
        LinkedList ans = LinkedList.mergeTwoLists(list1,list2);
        ans.show();
    }
}
