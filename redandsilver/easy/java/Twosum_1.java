package redandsilver.easy.java;

class Twosum_1 {
  public int[] twoSum(int[] nums, int target) {
    int[] answer = new int[2];
    for(int i=0; i<nums.length; i++){
      int b = target - nums[i];
      for(int j =1; j<nums.length; j++){
        if( b == nums[j] && i != j){
          answer[0] = i;
          answer[1] = j;
          break;
        }
      }

    }
    return answer;
  }
}