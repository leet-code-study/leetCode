package hyeontaek;

import java.util.Stack;

public class ImplementQueueUsingStack {

  public static void main(String[] args) {
    MyQueue queue = new MyQueue();
    queue.push(1);
    queue.push(2);
    System.out.println(queue.peek()); // 1
    System.out.println(queue.pop()); // 1
    System.out.println(queue.empty());
  }

  static class MyQueue {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public MyQueue() {

    }

    public void push(int x) {
      stack1.push(x);
    }

    public int pop() {
      if (stack2.isEmpty()) {
        while (!stack1.isEmpty()) {
          stack2.push(stack1.pop());
        }
      }
      return stack2.pop();
    }

    public int peek() {
      if (stack2.isEmpty()) {
        while (!stack1.isEmpty()) {
          stack2.push(stack1.pop());
        }
      }
      return stack2.peek();
    }

    public boolean empty() {
      return stack1.isEmpty() && stack2.isEmpty();
    }
  }

}
