package hyeontaek;

public class SingleNumber {

  public int singleNumber(int[] nums) {
    int result = 0;
    for (int num : nums) {
      result ^= num;
    }
    return result;
  }
  public static void main(String[] args) {
    int[] nums = {4, 1,2,1,2};
    SingleNumber solution = new SingleNumber();
    System.out.println(solution.singleNumber(nums));
  }

}
