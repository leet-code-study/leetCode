package hyeontaek;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {

  public static void main(String[] args) {
    IntersectionOfTwoArrays solution = new IntersectionOfTwoArrays();
    int[] nums1 = {1, 2, 2, 1};
    int[] nums2 = {2, 2};
    System.out.println(Arrays.toString(solution.intersection(nums1, nums2)));
    System.out.println(Arrays.toString(solution.intersection2(nums1, nums2)));
  }

  public int[] intersection(int[] nums1, int[] nums2) {
    Set<Integer> set = new HashSet<>();
    Arrays.stream(nums1).forEach(set::add);
    return Arrays.stream(nums2).filter(set::contains).distinct().toArray();
  }

  public int[] intersection2(int[] nums1, int[] nums2) {
    Set<Integer> set = new HashSet<>();
    for (int num : nums1) {
      set.add(num);
    }
    Set<Integer> intersection = new HashSet<>();
    for (int num : nums2) {
      if (set.contains(num)) {
        intersection.add(num);
      }
    }
    int[] result = new int[intersection.size()];
    int index = 0;
    for (int num : intersection) {
      result[index++] = num;
    }
    return result;
  }


}
