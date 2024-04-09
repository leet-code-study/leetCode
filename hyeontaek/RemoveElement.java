package hyeontaek;

import java.util.Arrays;

public class RemoveElement {

  public int removeElement (int[] nums, int val) {
    int index = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        index++;
      } else {
        nums[i] = 51;
      }
    }
    Arrays.sort(nums);
    return index;
  }
  public int removeElement2 (int[] nums, int val) {
    int index = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        nums[index++] = nums[i];
      }
    }
    return index;
  }

  public static void main(String[] args) {
    int[] nums = {3,2,2,3};
    int val = 3;
    print(nums, val);
    print2(nums, val);
  }
  private static void print(int[] nums, int val) {
    int[] tempNums = Arrays.copyOf(nums, nums.length);
    RemoveElement solution = new RemoveElement();
    int result = solution.removeElement(tempNums, val);
    System.out.printf("\n%s, nums = %s\n",result, Arrays.toString(tempNums));
  }
  private static void print2(int[] nums, int val) {
    int[] tempNums = Arrays.copyOf(nums, nums.length);
    RemoveElement solution = new RemoveElement();
    int result = solution.removeElement2(tempNums, val);
    System.out.printf("\n%s, nums = %s\n",result, Arrays.toString(tempNums));
  }

}
