package hyeontaek;

public class Sqrt {

  public int mySqrt(int x) {
    if (x == 0) {
      return 0;
    }
    int start = 0;
    int end = x;
    while (start + 1 < end) {
      int mid = start + (end - start) / 2;
      if (mid == x / mid) {
        return mid;
      } else if (mid < x / mid) {
        start = mid;
      } else {
        end = mid;
      }
    }
    if (end == x / end) {
      return end;
    }
    return start;
  }

  public int mySqrt2(int x) {
    return (int) Math.sqrt(x);
  }

  public static void main(String[] args) {
    Sqrt solution = new Sqrt();
    System.out.println(solution.mySqrt(8));
    System.out.println(solution.mySqrt2(8));
  }

}
