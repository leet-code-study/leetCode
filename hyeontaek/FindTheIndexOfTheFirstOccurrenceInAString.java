package hyeontaek;

public class FindTheIndexOfTheFirstOccurrenceInAString {

  public int strStr(String haystack, String needle) {
    return haystack.indexOf(needle);
  }

  public static void main(String[] args) {
    FindTheIndexOfTheFirstOccurrenceInAString solution = new FindTheIndexOfTheFirstOccurrenceInAString();
    String haystack = "sadbutsad";
    String needle = "sad";
    System.out.println(solution.strStr(haystack, needle));
  }

}
