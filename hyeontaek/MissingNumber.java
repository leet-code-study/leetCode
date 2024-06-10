package hyeontaek;

public class MissingNumber {

  public static void main(String[] args) {
    MissingNumber solution = new MissingNumber();
    int[] nums = {3, 0, 1};
    int missing = solution.missingNumber(nums);
    System.out.println("Missing number: " + missing);
  }

  public int missingNumber(int[] nums) {
    int n = nums.length;
    int sum = n * (n + 1) / 2;
    int actualSum = 0;

    for (int num : nums) {
      actualSum += num;
    }

    return sum - actualSum;
  }

}
