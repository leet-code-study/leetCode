package hyeontaek;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

  public static void main(String[] args) {
    ContainsDuplicate solution = new ContainsDuplicate();
    System.out.println(solution.containsDuplicate(new int[]{1, 2, 3, 1}));
  }

  public boolean containsDuplicate(int[] nums) {
    Set<Integer> result = new HashSet<>();
    for (int num : nums) {
      if (result.contains(num)) {
        return true;
      }
      result.add(num);
    }
    return false;
  }

}
