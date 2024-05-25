package hyeontaek;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate2 {

  public static void main(String[] args) {
    ContainsDuplicate2 solution = new ContainsDuplicate2();
    System.out.println(solution.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
  }

  public boolean containsNearbyDuplicate(int[] nums, int k) {
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      if (i > k) {
        set.remove(nums[i - k - 1]);
      }
      if (!set.add(nums[i])) {
        return true;
      }
    }
    return false;
  }

}
