package hyeontaek;

public class CountingBits {

  public static int[] countBits(int n) {
    int[] ans = new int[n + 1];
    for (int i = 0; i <= n; ++i) {
      ans[i] = Integer.bitCount(i);
    }
    return ans;
  }

  private static int bitCount(int i) {
    i = i - ((i >>> 1) & 0x55555555);
    i = (i & 0x33333333) + ((i >>> 2) & 0x33333333);
    i = (i + (i >>> 4)) & 0x0f0f0f0f;
    i = i + (i >>> 8);
    i = i + (i >>> 16);
    return i & 0x3f;
  }

  public static void main(String[] args) {
    int n = 5;
    int[] ans = countBits(n);
    for (int i : ans) {
      System.out.print(i + " ");
    }
  }

}
