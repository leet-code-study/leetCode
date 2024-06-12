package hyeontaek;

public class FirstBadVersion {

  private static boolean isBadVersion(int version) {
    // Implement the logic to check if a version is bad or not
    // For this example, we'll assume versions 1 to 4 are bad and the rest are good
    return version >= 1 && version <= 4;
  }

  public static void main(String[] args) {
    FirstBadVersion solution = new FirstBadVersion();
    int n = 5;
    int firstBadVersion = solution.firstBadVersion(n);
    System.out.println("The first bad version is: " + firstBadVersion);
  }

  public int firstBadVersion(int n) {
    int left = 1;
    int right = n;

    while (left < right) {
      int mid = left + (right - left) / 2;
      if (isBadVersion(mid)) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }

    return left;
  }

}
