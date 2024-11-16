package LinkedList.QuestionLC;

public class RotateList {
    private class ListNode {
        private int value;
        private ListNode next;

        public ListNode(int value) {
            this.value = value;
        }

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }

    private ListNode head;
    private ListNode tail;

    public void insert(int value) {
        ListNode listNode = new ListNode(value, null);
        if (head == null) {
            head = listNode;
            tail = listNode;
            return;
        }
        tail.next = listNode;
        tail = listNode;
    }

    public int countNodes(ListNode head){
        int count = 0;
        while(head != null){
            head = head.next;
            count++;
        }
        return count;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return null;
        }
        k = k % countNodes(head);
        ListNode last;
        ListNode prev;
        for (int i = 0; i < k; i++) {
            last = head;
            prev = head;
            while(last.next != null){
                prev = last;
                last = last.next;
            }
            last.next = head;
            prev.next = null;
            head = last;
        }
        return head;
    }

    public void show() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        RotateList list = new RotateList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.show();
        list.head = list.rotateRight(list.head, 2);
        list.show();
    }
}
