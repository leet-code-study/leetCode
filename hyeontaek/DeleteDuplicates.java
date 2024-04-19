package hyeontaek;

public class DeleteDuplicates {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

      public String toString() {
        if (next == null) {
          return val + "";
        }
        return val + " -> " + next;
      }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

  public static void main(String[] args) {
    DeleteDuplicates solution = new DeleteDuplicates();
    ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
    System.out.println(solution.deleteDuplicates(head));
  }

}
