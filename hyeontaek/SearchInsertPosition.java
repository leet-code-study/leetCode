package hyeontaek;

public class SearchInsertPosition {



  public int searchInsert(int[] nums, int target) {
    int index = 0;
    for (int num : nums) {
      if (num >= target) {
        return index;
      }
      index++;
    }
    return index;
  }

  public int searchInsert2(int[] nums, int target) {
    int start = 0;
    int end = nums.length - 1;
    if (target <= nums[0]) {
      return 0;
    }
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (target == nums[mid]) {
        return mid;
      }
      if (target < nums[mid]) {
        end = mid - 1;
      }
      if (target > nums[mid]) {
        start = mid + 1;
      }
    }
    if (end >= 0 && target <= nums[end]) {
      return end;
    } else {
      return start;
    }
  }
  public static void main(String[] args) {
    SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
    int[] nums = {1, 3, 5, 6};
    int target = 5;
    System.out.println(searchInsertPosition.searchInsert(nums, target));
    System.out.println(searchInsertPosition.searchInsert2(nums, target));
  }
}
