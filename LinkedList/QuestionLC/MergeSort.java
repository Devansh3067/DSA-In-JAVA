package LinkedList.QuestionLC;

public class MergeSort {

    private ListNode head;
    private ListNode tail;

    public void insert(int value) {
        ListNode node = new ListNode(value);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        tail = node;
    }

    public void show() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            temp = temp.next;
            if (temp != null) {
                System.out.print("-->");
            }
        }
        System.out.println();
    }

    public static ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode sortList(ListNode head) {// Using Merge sort
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = middleNode(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;
        left = sortList(left);
        right = sortList(right);
        return merge(left, right);
    }

    public ListNode merge(ListNode first, ListNode second) {
        ListNode co_head = new ListNode();
        ListNode co_tail = co_head; // making this as I want to return the co_head, but if we use it in operation, then it will be updated, and could not be returned.
        while (first != null && second != null) {
            if (first.val < second.val) {
                co_tail.next = first;
                co_tail = co_tail.next;
                first = first.next;
            } else {
                co_tail.next = second;
                co_tail = co_tail.next;
                second = second.next;
            }
        }
        co_tail.next = (first == null) ? second : first;
        return co_head.next;
    }

    public static void main(String[] args) {
        MergeSort list = new MergeSort();
        list.insert(4);
        list.insert(2);
        list.insert(1);
        list.insert(3);

        list.show();
        list.head = list.sortList(list.head); // Update the head to the sorted list
        list.show();
    }

    private class ListNode {
        private int val;
        private ListNode next;

        ListNode() {

        }

        ListNode(int val) {
            this.val = val;
        }
    }
}
