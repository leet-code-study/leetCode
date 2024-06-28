package hyeontaek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class IntersectionOfTwoArrays2 {

  public static void main(String[] args) {
    IntersectionOfTwoArrays2 solution = new IntersectionOfTwoArrays2();
    int[] nums1 = {1, 2, 2, 1};
    int[] nums2 = {2};
    System.out.println(Arrays.toString(solution.intersect(nums1, nums2))); // 2
  }

  public int[] intersect(int[] nums1, int[] nums2) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i : nums1){
      int freq = map.getOrDefault(i, 0);
      map.put(i, freq + 1);
    }
    List<Integer> list = new ArrayList<>();
    for(int i : nums2){
      if(map.get(i) != null && map.get(i) > 0){
        list.add(i);
        map.put(i, map.get(i) - 1);
      }
    }
    int[] ret = new int[list.size()];
    for(int i = 0; i < list.size();i++){
      ret[i] = list.get(i);
    }
    return ret;
  }

}
