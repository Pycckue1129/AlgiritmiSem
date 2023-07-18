public class Main {
    public static void main(String[] args) {
        // Создаем список: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        LinkedListReverse solution = new LinkedListReverse();
        ListNode reversedHead = solution.reverseList(head);

        ListNode currNode = reversedHead;
        while (currNode != null) {
            System.out.print(currNode.val + " ");
            currNode = currNode.next;
        }
    }
}

