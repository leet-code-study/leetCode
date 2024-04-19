package hyeontaek;

import java.util.Arrays;

public class MergeSortedArray {

  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int index = m + n - 1;
    m--;
    n--;
    while (m >= 0 && n >= 0) {
      if (nums1[m] > nums2[n]) {
        nums1[index--] = nums1[m--];
      } else {
        nums1[index--] = nums2[n--];
      }
    }
    while (n >= 0) {
      nums1[index--] = nums2[n--];
    }
  }

  public void merge2(int[] nums1, int m, int[] nums2, int n) {
    for (int i = 0; i < n; i++) {
      nums1[m] = nums2[i];
      m++;
    }
    Arrays.sort(nums1);
  }

  public static void main(String[] args) {
    MergeSortedArray solution = new MergeSortedArray();
    int[] nums1 = {1, 2, 3, 0, 0, 0};
    int[] nums2 = {2, 5, 6};
    print(nums1, solution, nums2);
    print2(nums1, solution, nums2);

  }

  private static void print(int[] nums1, MergeSortedArray solution, int[] nums2) {
    int[] nums1Copy = Arrays.copyOf(nums1, nums1.length);
    solution.merge(nums1Copy, 3, nums2, 3);
    System.out.println(Arrays.toString(nums1Copy));
  }
  private static void print2(int[] nums1, MergeSortedArray solution, int[] nums2) {
    int[] nums1Copy = Arrays.copyOf(nums1, nums1.length);
    solution.merge2(nums1Copy, 3, nums2, 3);
    System.out.println(Arrays.toString(nums1Copy));
  }

}
