package hyeontaek;

import java.math.BigInteger;

public class AddBinary {

  public String addBinary(String a, String b) {
    BigInteger bigIntegerA = new BigInteger(a, 2);
    BigInteger bigIntegerB = new BigInteger(b, 2);
    BigInteger result = bigIntegerA.add(bigIntegerB);
    return result.toString(2);
  }

  public String addBinary2(String a, String b) {
    StringBuilder sb = new StringBuilder();
    int aLen = a.length() - 1, bLen = b.length() - 1, carry = 0;

    while (aLen >= 0 || bLen >= 0 || carry != 0) {
      if (aLen >= 0) {
        carry += a.charAt(aLen) - 48;
        aLen--;
      }
      if (bLen >= 0) {
        carry += b.charAt(bLen) - 48;
        bLen--;
      }
      sb.append(carry % 2);
      carry /= 2;
    }
    return sb.reverse().toString();
  }

  public static void main(String[] args) {
    AddBinary solution = new AddBinary();
    String a = "10";
    String b = "1";
    String result = solution.addBinary(a, b);
    String result2 = solution.addBinary2(a, b);
    System.out.println(result);
    System.out.println(result2);
  }
}
