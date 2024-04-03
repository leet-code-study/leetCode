package hyeontaek;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

  public static void main(String[] args) {
    RomanToInt solution = new RomanToInt();
    System.out.println(solution.romanToInt("III"));
    System.out.println(solution.romanToInt("LVIII"));
    System.out.println(solution.romanToInt("MCMXCIV"));
    System.out.println(solution.romanToInt2("III"));
    System.out.println(solution.romanToInt2("LVIII"));
    System.out.println(solution.romanToInt2("MCMXCIVK"));
  }

  public int romanToInt(String s) {
    Map<Character, Integer> map = new HashMap<>();
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);

    int answer = 0;
    for (int i = 0; i < s.length(); i++) {
      if (i < s.length() - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
        answer -= map.get(s.charAt(i));
      } else {
        answer += map.get(s.charAt(i));
      }
    }
    return answer;
  }

  public int romanToInt2(String s) {
    int answer = 0, num = 0;
    for (int i = s.length() - 1; i >= 0; i--) {
      num = switch (s.charAt(i)) {
        case 'I' -> 1;
        case 'V' -> 5;
        case 'X' -> 10;
        case 'L' -> 50;
        case 'C' -> 100;
        case 'D' -> 500;
        case 'M' -> 1000;
        default -> throw new RuntimeException("잘못된 로마 숫자입니다.: " + s.charAt(i));
      };
      if (4 * num < answer) {
        answer -= num;
      } else {
        answer += num;
      }
    }
    return answer;
  }

}
