package hyeontaek.twoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_2 {

  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (map.containsKey(complement)) {
        return new int[]{map.get(complement), i};
      }
      map.put(nums[i], i);
    }
    return new int[] {};
  }

  public static void main(String[] args) {
    TwoSum_2 solution = new TwoSum_2();
    int[] nums = {3,3};
    int target = 6;
    System.out.println(Arrays.toString(solution.twoSum(nums, target)));

    int[] nums2 = {2,7,11,15};
    int target2 = 9;
    System.out.println(Arrays.toString(solution.twoSum(nums2, target2)));
  }
}
