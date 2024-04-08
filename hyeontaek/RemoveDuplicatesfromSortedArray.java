package hyeontaek;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesfromSortedArray {

  public int removeDuplicates(int[] nums) {
    Set<Integer> set = new LinkedHashSet<>();

    for (int num : nums) {
      set.add(num);
    }
    int i = 0;

    for (int element : set) {
      nums[i++] = element;
    }
    return set.size();
  }

  public int removeDuplicates2(int[] nums) {
    Arrays.sort(nums);
    int counter = 1;
    int j = 1;
    while (counter < nums.length) {
      if (nums[counter] != nums[counter - 1]) {
        nums[j] = nums[counter];
        j++;
      }
      counter++;
    }
    return j;
  }

  public int removeDuplicates3(int[] nums) {
    Arrays.sort(nums);
    int j = 1;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[i - 1]) {
        nums[j] = nums[i];
        j++;
      }
    }
    return j;
  }

  public static void main(String[] args) {
    int[] nums = {-3, -1, 0, 0, 0, 3, 3};
    print3(nums);
    print2(nums);
    print(nums);
  }

  private static void print(int[] nums) {
    RemoveDuplicatesfromSortedArray solution = new RemoveDuplicatesfromSortedArray();
    int result = solution.removeDuplicates(nums);
    System.out.printf("\n%s, nums : %s\n", result, Arrays.toString(nums));
  }

  private static void print2(int[] nums) {
    RemoveDuplicatesfromSortedArray solution = new RemoveDuplicatesfromSortedArray();
    int result = solution.removeDuplicates2(nums);
    System.out.printf("\n%s, nums : %s\n", result, Arrays.toString(nums));
  }

  private static void print3(int[] nums) {
    RemoveDuplicatesfromSortedArray solution = new RemoveDuplicatesfromSortedArray();
    int result = solution.removeDuplicates3(nums);
    System.out.printf("\n%s, nums : %s\n", result, Arrays.toString(nums));
  }


}
