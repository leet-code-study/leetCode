package hyeontaek;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

  public static void main(String[] args) {
    SummaryRanges solution = new SummaryRanges();
    int[] nums = {0, 1, 2, 4, 5, 7};
    System.out.println(solution.summaryRanges(nums)); // [0->2, 4->5, 7]
  }

  public List<String> summaryRanges(int[] nums) {
    List<String> result = new ArrayList<>();
    int start = 0;
    int end = 0;
    for (int i = 0; i < nums.length; i++) {
      if (i == nums.length - 1 || nums[i] + 1 != nums[i + 1]) {
        end = i;
        result.add(nums[start] == nums[end] ? String.valueOf(nums[start])
            : nums[start] + "->" + nums[end]);
        start = i + 1;
      }
    }
    return result;
  }

}
