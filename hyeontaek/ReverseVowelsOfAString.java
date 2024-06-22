package hyeontaek;

public class ReverseVowelsOfAString {

  public static void main(String[] args) {
    ReverseVowelsOfAString solution = new ReverseVowelsOfAString();
    System.out.println(solution.reverseVowels("hello"));
  }

  public String reverseVowels(String s) {
    char[] arr = s.toCharArray();
    int left = 0;
    int right = arr.length - 1;
    while (left < right) {
      if (isNotVowel(arr[left])) {
        left++;
        continue;
      }
      if (isNotVowel(arr[right])) {
        right--;
        continue;
      }
      char temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
      left++;
      right--;
    }
    return String.valueOf(arr);
  }

  public boolean isNotVowel(char c) {
    return c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'A' && c != 'E'
        && c != 'I' && c != 'O' && c != 'U';
  }
}
