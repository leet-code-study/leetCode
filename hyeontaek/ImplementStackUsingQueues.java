package hyeontaek;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {

  public static void main(String[] args) {
    MyStack stack = new MyStack();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    System.out.println(stack.top());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.empty());
  }

  static class MyStack {

    Queue<Integer> queue = new LinkedList<>();

    public MyStack() {
    }

    public void push(int x) {
      queue.add(x);
      for (int i = 0; i < queue.size() - 1; i++) {
        queue.add(queue.remove());
      }
    }

    public int pop() {
      return queue.remove();
    }

    public int top() {
      return queue.peek();
    }

    public boolean empty() {
      return queue.isEmpty();
    }
  }
}
