package hyeontaek;

public class ValidPalindrome {

  public boolean isPalindrome(String s) {
    String str = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
    int start = 0;
    int end = str.length() - 1;
    while (start < end) {
      if (str.charAt(start) != str.charAt(end)) {
        return false;
      }
      start++;
      end--;
    }
    return true;
  }

  public static void main(String[] args) {
    ValidPalindrome solution = new ValidPalindrome();
    System.out.println(solution.isPalindrome("ab_a"));
  }

}
