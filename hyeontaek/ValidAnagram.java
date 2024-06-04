package hyeontaek;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

  public static void main(String[] args) {
    String s = "anagram";
    String t = "nagaram";
    ValidAnagram solution = new ValidAnagram();
    System.out.println(solution.isAnagram(s, t));
    System.out.println(solution.isAnagram2(s, t));
  }

  public boolean isAnagram(String s, String t) {
    Map<Character, Integer> map = new HashMap<>();
    for (char c : s.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }
    for (char c : t.toCharArray()) {
      if (!map.containsKey(c)) {
        return false;
      }
      map.put(c, map.get(c) - 1);
      if (map.get(c) == 0) {
        map.remove(c);
      }
    }
    return map.isEmpty();
  }

  public boolean isAnagram2(String s, String t) {
    char[] sChars = s.toCharArray();
    char[] tChars = t.toCharArray();

    Arrays.sort(sChars);
    Arrays.sort(tChars);

    return Arrays.equals(sChars, tChars);
  }
}
