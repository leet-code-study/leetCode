package hyeontaek;

public class LongestCommonPrefix {

  public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) return "";
    String prefix = strs[0];
    for (int i = 1; i < strs.length; i++)
      while (strs[i].indexOf(prefix) != 0) {
        prefix = prefix.substring(0, prefix.length() - 1);
        if (prefix.isEmpty()) return "";
      }
    return prefix;
  }

  public static void main(String[] args) {
    LongestCommonPrefix f = new LongestCommonPrefix();
    String[] strs = {"flower","flow","flight"};
    System.out.println(f.longestCommonPrefix(strs));
    String[] strs2 = {"dog","racecar","car"};
    System.out.println(f.longestCommonPrefix(strs2));
  }

}
