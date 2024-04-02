import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 숫자와 해당 숫자의 인덱스를 저장할 해시맵을 생성
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            // 보수(complement)를 계산
            int complement = target - nums[i];
            
            // 해시맵에서 보수를 찾기
            if (map.containsKey(complement)) {
                // 보수가 해시맵에 있다면, 보수와 현재 숫자가 합쳐서 목표값이 되므로, 이 두 숫자의 인덱스를 반환
                return new int[] { map.get(complement), i };
            }
            
            // 보수가 없다면, 현재 숫자와 그 인덱스를 해시맵에 추가
            map.put(nums[i], i);
        }
        
        // 만약 해결책이 없다면 null을 반환하거나 요구에 따라 예외를 throw
        return null;
    }
    
}
