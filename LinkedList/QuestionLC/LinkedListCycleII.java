package LinkedList.QuestionLC;

public class LinkedListCycleII {

    private Node head;
    private Node tail;

    private int size;

    public LinkedListCycleII() {
        this.size = 0;
    }

    public void insert(int value, int pos) {
        size++;
        Node node = new Node(value, null);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        tail = node;

        if (pos <= size && pos >= 0) {
            Node temp = head;
            while(pos>0){
                temp = temp.next;
                pos--;
            }
            tail.next = temp;
        }
    }

//    public void show(){
//        Node temp = head;
//        while(temp != null){
//            System.out.print(temp.value);
//            temp = temp.next;
//            if(temp != null){
//                System.out.print("-->");
//            }
//        }
//        System.out.println();
//    }

    public static int countCycle(Node head) {
        Node fast = head;
        Node slow = head;

        int count = 0;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                do{
                    slow = slow.next;
                    count++;
                }while(slow != fast);
                return count;
            }
        }
        return 0;
    }

    public static Node detectCycle(Node head) {
        Node f = head;
        Node s = head;
        int len = countCycle(s);
        if(len == 0) return null;
        while(len > 0){
            s = s.next;
            len--;
        }
        while(f != s){
            f = f.next;
            s = s.next;
        }
        return f;
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
        LinkedListCycleII list = new LinkedListCycleII();

        list.insert(3,1);
        list.insert(2,1);
        list.insert(0,1);
        list.insert(-4,1);

//        list.show();

        int len = countCycle(list.head);
        System.out.println("The length of the cycle = " + len);

        Node start = detectCycle(list.head);
        if( start != null){
            System.out.println("The cycle starts from value = " + start.value);
        }
        else System.out.println("No cycle present");
    }
}
