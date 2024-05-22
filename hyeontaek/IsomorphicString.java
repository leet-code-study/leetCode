package hyeontaek;

public class IsomorphicString {

  public static void main(String[] args) {
    IsomorphicString solution = new IsomorphicString();
    System.out.println(solution.isIsomorphic("egg", "add"));
    System.out.println(solution.isIsomorphic("foo", "bar"));
    System.out.println(solution.isIsomorphic("paper", "title"));
  }

  public boolean isIsomorphic(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }

    for (int i = 0; i < s.length(); i++) {
      if (s.indexOf(s.charAt(i)) != t.indexOf(t.charAt(i))) {
        return false;
      }
    }

    return true;
  }

}
