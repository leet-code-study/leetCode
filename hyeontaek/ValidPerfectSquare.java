package hyeontaek;

public class ValidPerfectSquare {

  public static boolean isPerfectSquare(int num) {
    if (num < 2) {
      return true;
    }
    long left = 2, right = num / 2, mid, square;
    while (left <= right) {
      mid = left + (right - left) / 2;
      square = mid * mid;
      if (square == num) {
        return true;
      } else if (square > num) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println(isPerfectSquare(16));
    System.out.println(isPerfectSquare(14));
  }

}
