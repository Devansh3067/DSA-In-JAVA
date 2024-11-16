package LinkedList.QuestionLC;

import java.util.List;

public class MiddleNode {

    private ListNode head;
    private ListNode tail;

    public static class ListNode {
        private final int value;
        private ListNode next;

        public ListNode(int value) {
            this.value = value;
        }

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insert(int value) {
        ListNode node = new ListNode(value, null);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        tail = node;
    }

    public void show(){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.value);
            temp = temp.next;
            if(temp != null){
                System.out.print("-->");
            }
        }
        System.out.println();
    }

    public static ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        temp = head;
        for (int i = 1; i < (count / 2) + 1; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public static ListNode middleNodeII(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }


    public static void main(String[] args) {
        MiddleNode list = new MiddleNode();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);

        list.show();

        ListNode midNode = middleNode(list.head);
        System.out.println("The middle node value = " + midNode.value);

        ListNode midNodeII = middleNodeII(list.head);
        System.out.println("The middle node value by fast and slow pointer method = " + midNodeII.value);
    }
}
