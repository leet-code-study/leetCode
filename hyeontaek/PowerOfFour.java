package hyeontaek;

public class PowerOfFour {

  public static void main(String[] args) {
    PowerOfFour solution = new PowerOfFour();
    int n = 16;
    System.out.println(solution.isPowerOfFour(n));
  }

  public boolean isPowerOfFour(int n) {
    if (n == 1) {
      return true;
    }
    if (n % 4 != 0 || n == 0) {
      return false;
    }
    return isPowerOfFour(n / 4);
  }
}
