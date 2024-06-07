package hyeontaek;

public class UglyNumber {

  public static void main(String[] args) {
    UglyNumber solution = new UglyNumber();
    System.out.println(solution.isUgly(6));
    System.out.println(solution.isUgly(8));
    System.out.println(solution.isUgly(14));
  }

  public boolean isUgly(int n) {
    if (n <= 0) {
      return false;
    }
    if (n == 1) {
      return true;
    }

    while (n % 2 == 0) {
      n /= 2;
    }
    while (n % 3 == 0) {
      n /= 3;
    }
    while (n % 5 == 0) {
      n /= 5;
    }

    return n == 1;
  }
}
