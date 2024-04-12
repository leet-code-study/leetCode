package hyeontaek;

public class LengthOfLastWord {

  public int lengthOfLastWord(String s) {
    String[] sSplit = s.trim().split(" ");
    return sSplit[sSplit.length - 1].length();
  }

  public int lengthOfLastWord2(String s) {
    return s.trim().length() - (s.trim().lastIndexOf(" ") + 1);
  }

  public static void main(String[] args) {
    LengthOfLastWord solution = new LengthOfLastWord();
    String s = "   fly me   to   the moon  ";
    int result = solution.lengthOfLastWord(s);
    int result2 = solution.lengthOfLastWord2(s);
    System.out.printf("\n%s, last word : %s\n", result, lastWord(s));
    System.out.printf("\n%s, last word : %s\n", result2, lastWord(s));
  }

  private static String lastWord(String s) {
    s = s.trim();
    return s.substring(s.lastIndexOf(" ") + 1);
  }

}
