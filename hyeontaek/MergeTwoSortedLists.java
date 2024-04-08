package hyeontaek;

class ListNode {

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

public class MergeTwoSortedLists {

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if (list1 == null && list2 == null) {
      return null;
    }

    if (list1 == null) {
      return list2;
    }

    if (list2 == null) {
      return list1;
    }

    if (list1.val < list2.val) {
      list1.next = mergeTwoLists(list1.next, list2);
      return list1;
    }

    list2.next = mergeTwoLists(list1, list2.next);
    return list2;
  }

  public static void main(String[] args) {
    ListNode list1 = new ListNode(1,new ListNode(2, new ListNode(4)));
    System.out.println(list1);
    ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
    System.out.println(list2);

    MergeTwoSortedLists solution = new MergeTwoSortedLists();
    ListNode result = solution.mergeTwoLists(list1, list2);

    System.out.println(result);
  }
}

