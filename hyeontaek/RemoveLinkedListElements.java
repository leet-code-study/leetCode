package hyeontaek;

public class RemoveLinkedListElements {

  public static class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public String toString() {
      return val + " -> " + next;
    }
  }

  public ListNode removeElements(ListNode head, int val) {
    if (head == null) return null;

    if (head.val == val) return removeElements(head.next, val);

    head.next = removeElements(head.next, val);

    return head;
  }
  public static void main(String[] args) {
    ListNode head = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));
    RemoveLinkedListElements solution = new RemoveLinkedListElements();
    ListNode result = solution.removeElements(head, 6);
    System.out.println(result);
  }
}
