package hyeontaek;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

  public static void main(String[] args) {
    WordPattern solution = new WordPattern();
    String pattern = "abba";
    String s = "dog cat cat fish";
    System.out.println(solution.wordPattern(pattern, s));
  }

  public boolean wordPattern(String pattern, String s) {
    String[] words = s.split(" ");
    if (words.length != pattern.length()) {
      return false;
    }

    Map<Character, String> map = new HashMap<>();
    for (int i = 0; i < pattern.length(); i++) {
      char c = pattern.charAt(i);

      if (map.containsKey(c)) {
        if (!map.get(c).equals(words[i])) {
          return false;
        }
      } else {
        if (map.containsValue(words[i])) {
          return false;
        }
        map.put(c, words[i]);
      }
    }

    return true;
  }
}
