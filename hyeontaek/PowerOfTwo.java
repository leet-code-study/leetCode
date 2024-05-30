package hyeontaek;

public class PowerOfTwo {

  public static void main(String[] args) {
    PowerOfTwo solution = new PowerOfTwo();
    System.out.println(solution.isPowerOfTwo(16));
    System.out.println(solution.isPowerOfTwo2(16));
    System.out.println(solution.isPowerOfTwo3(16));
  }

  public boolean isPowerOfTwo(int n) {
    if (n == 0) {
      return false;
    }
    if (n == 1) {
      return true;
    }
    if (n % 2 != 0) {
      return false;
    }
    return isPowerOfTwo(n / 2);
  }

  public boolean isPowerOfTwo2(int n) {
    return n > 0 && (n & (n - 1)) == 0;
  }

  public boolean isPowerOfTwo3(int n) {
    for (int i = 0; i < 32; i++) {
      if (n == Math.pow(2, i)) {
        return true;
      }
    }
    return false;
  }

}
