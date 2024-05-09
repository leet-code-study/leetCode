package hyeontaek;

public class IntersectionOfTwoLinkedLists {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
        public String toString() {
          if (next == null) return String.valueOf(val);
          return String.format("%s -> %s", val, next);
        }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }

        return a;
    }

    public static void main(String[] args) {
        IntersectionOfTwoLinkedLists solution = new IntersectionOfTwoLinkedLists();
        ListNode a = new ListNode(4);
        a.next = new ListNode(1);
        a.next.next = new ListNode(8);
        a.next.next.next = new ListNode(4);
        a.next.next.next.next = new ListNode(5);

        ListNode b = new ListNode(5);
        b.next = new ListNode(6);
        b.next.next = new ListNode(1);
        b.next.next.next = a.next.next;

        System.out.println(solution.getIntersectionNode(a, b));
    }

}
