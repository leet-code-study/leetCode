package itpark1018;

import java.util.HashMap;

public class RomanToInteger {
  public int romanToInt(String s) {

    HashMap<Character, Integer> romanValues = new HashMap<>();
    romanValues.put('I', 1);
    romanValues.put('V', 5);
    romanValues.put('X', 10);
    romanValues.put('L', 50);
    romanValues.put('C', 100);
    romanValues.put('D', 500);
    romanValues.put('M', 1000);

    int result = 0;
    int preValue = 0;

    for (int i = s.length() - 1; i >= 0 ; i--) {

      int value = romanValues.get(s.charAt(i));

      if (value < preValue) {
        result -= value;
      } else {
        result += value;
      }

      preValue = value;
    }

    return result;
  }
}
