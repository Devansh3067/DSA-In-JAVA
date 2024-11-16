package LinkedList.QuestionLC;

public class ReversingAList {

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

    private int size;

    public ReversingAList() {
        this.size = 0;
    }

    public void insert(int value) {
        size++;
        ListNode listNode = new ListNode(value, null);
        if (head == null) {
            head = listNode;
            tail = listNode;
            return;
        }
        tail.next = listNode;
        tail = listNode;
    }

    public ListNode reverse(ListNode temp) {
        if (temp.next == null) {
            head = temp;
            return temp;
        }
        ListNode listNode = reverse(temp.next);
        listNode.next = temp;
        tail = temp;
        temp.next = null;

        return head;
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode prev = null;
        ListNode pres = head;
        ListNode nex = head.next;

        while (pres != null) {
            pres.next = prev;
            prev = pres;
            pres = nex;
            if (nex != null)
                nex = nex.next;
        }
        return prev;
    }

    public void reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return;
        }
        ListNode prev = null;
        ListNode curr = head;
        for (int i = 0; curr != null && i < left - 1; i++) {
            prev = curr;
            curr = curr.next;
        }
        ListNode last = prev;
        ListNode end = curr;

        ListNode next = curr.next;
        for (int i = 0; curr != null && i < right - left + 1; i++) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if (next != null) {
                next = next.next;
            }
        }
        last.next = prev;
        end.next = curr;
    }

    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode dummyHead = reverseList(mid);
        ListNode tempHead = dummyHead;
        while (head != null && dummyHead != null) {
            if (head.value != dummyHead.value) {
                break;
            }
            head = head.next;
            dummyHead = dummyHead.next;
        }
        reverseList(tempHead);
        return head == null || dummyHead == null;
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
        ReversingAList list = new ReversingAList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);

        list.show();
//        list.reverse(list.head);
        list.show();

        list.reverseBetween(list.head, 3, 5);
        list.show();


        ReversingAList list2 = new ReversingAList();
        list2.insert(1);
        list2.insert(2);
        list2.insert(3);
        list2.insert(3);
        list2.insert(2);
        list2.insert(1);

        list2.show();
        if (list2.isPalindrome(list2.head)) {
            System.out.println("The list 2 is palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        list2.show();
    }
}
