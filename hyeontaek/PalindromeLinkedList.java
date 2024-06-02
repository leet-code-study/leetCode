package hyeontaek;

public class PalindromeLinkedList {

  static final int[] array = new int[100000];

  public static void main(String[] args) {
    PalindromeLinkedList solution = new PalindromeLinkedList();
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(2);
    head.next.next.next = new ListNode(1);

    System.out.println(solution.isPalindrome2(head));
    System.out.println(solution.isPalindrome3(head));
    System.out.println(solution.isPalindrome(head));
  }

  public boolean isPalindrome(ListNode head) {
    if (head == null) {
      return true;
    }
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    ListNode prev = null;
    while (slow != null) {
      ListNode next = slow.next;
      slow.next = prev;
      prev = slow;
      slow = next;
    }
    while (prev != null) {
      if (head.val != prev.val) {
        return false;
      }
      head = head.next;
      prev = prev.next;
    }
    return true;
  }

  public boolean isPalindrome2(ListNode head) {
    if (head == null) {
      return false;
    }
    ListNode tempNode = head;
    StringBuilder sb = new StringBuilder();

    while (tempNode != null) {
      sb.append(tempNode.val);
      tempNode = tempNode.next;
    }
    return String.valueOf(sb).contentEquals(sb.reverse());
  }

  public boolean isPalindrome3(ListNode head) {
    int[] arr = array;
    int size = 0;
    while (head != null) {
      arr[size++] = head.val;
      head = head.next;
    }
    int mid = size / 2;
    for (int i = 0; i < mid; i++) {
      if (arr[i] != arr[--size]) {
        return false;
      }
    }
    return true;
  }

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
      return val + " -> " + next;
    }
  }

}
