package hyeontaek;

public class IsPalindrome {

  public boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }
    int y = 0;
    int z = x;
    while (z != 0) {
      y = y * 10 + z % 10;
      z = z / 10;
    }
    return y == x;
  }

  public boolean isPalindrome2(int x) {
    if (x < 0 || (x != 0 && x % 10 == 0)) {
      return false;
    }
    String s = String.valueOf(x);
    int length = s.length();
    for (int i = 0; i < length / 2; i++) {
      if (s.charAt(i) != s.charAt(length - i -1)) {
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    IsPalindrome solution = new IsPalindrome();
    int x = 121;
    System.out.println(solution.isPalindrome(x));
    System.out.println(solution.isPalindrome2(x));
    int x2 = -121;
    System.out.println(solution.isPalindrome(x2));
    System.out.println(solution.isPalindrome2(x2));

  }
}
