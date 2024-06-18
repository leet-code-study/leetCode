package hyeontaek;

public class PowerOfThree {

  public static void main(String[] args) {
    PowerOfThree solution = new PowerOfThree();
    int n = 27;
    boolean result = solution.isPowerOfThree(n);
    System.out.println(result);
  }

  public boolean isPowerOfThree(int n) {
    if (n == 0) {
      return false;
    }
    if (n == 1) {
      return true;
    }
    if (n % 3 != 0) {
      return false;
    }
    return isPowerOfThree(n / 3);
  }

}
