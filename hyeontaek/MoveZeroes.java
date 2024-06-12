package hyeontaek;

public class MoveZeroes {

  public static void main(String[] args) {
    MoveZeroes solution = new MoveZeroes();
    int[] nums = {0, 1, 0, 3, 12};
    solution.moveZeroes(nums);
    for (int num : nums) {
      System.out.printf(num + " ");
    }
  }

  public void moveZeroes(int[] nums) {
    int idx = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        nums[idx++] = nums[i];
      }
    }
    for (int i = idx; i < nums.length; i++) {
      nums[i] = 0;
    }
  }

}
