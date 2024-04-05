package hyeontaek;

import java.util.Stack;

public class ValidParentheses {

  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    for (char c : s.toCharArray()) {
      if (c == '(') {
        stack.push(')');
      } else if (c == '[') {
        stack.push(']');
      } else if (c == '{') {
        stack.push('}');
      } else if (stack.isEmpty() || stack.pop() != c) {
        return false;
      }
    }
    return stack.isEmpty();
  }

  public boolean isValid2(String s) {
    int index = -1;
    char[] arr = new char[s.length()];
    for (char c : s.toCharArray()) {
      if ("{([".indexOf(c) != -1) {
        arr[++index] = c;
      } else {
        if (index >= 0 && ((c == '}' && arr[index] == '{') || (c == ']' && arr[index] == '[')
            || arr[index] == '(' && c == ')')) {
          index--;
        } else {
          return false;
        }
      }
    }
    return index == -1;
  }

  public static void main(String[] args) {
    String s;
    s = "()";
    print(s);
    s = "()[]{}";
    print(s);
    s = "(]";
    print(s);
    s = "([)]";
    print(s);
    s = "((";
    print(s);
  }

  private static void print(String s) {
    ValidParentheses solution = new ValidParentheses();
    System.out.printf("\ns : %s\nValid : %b\nValid2 : %b\n", s, solution.isValid(s), solution.isValid2(s));
  }

}
