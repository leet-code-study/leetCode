package itpark1018;

import java.util.Stack;

public class PalindromeNumber {
  public boolean isPalindrome(int x) {
    String xString = Integer.toString(x);
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < xString.length(); i++) {
      stack.push(xString.charAt(i));
    }

    StringBuilder stringBuilder = new StringBuilder();
    while (!stack.isEmpty()) {
      stringBuilder.append(stack.pop());
    }

    return stringBuilder.toString().equals(xString);
  }
}
