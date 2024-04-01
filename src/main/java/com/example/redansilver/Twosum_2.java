package com.example.redansilver;

import java.util.*;
class Twosum_2 {
  public int[] twoSum(int[] nums, int target) {
    int[] answer = new int[2];
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0; i<nums.length; i++){
      map.put(nums[i], i);
    }
    for(int i=0; i<nums.length; i++){
      int number = target - nums[i];
      if(map.containsKey(number) && map.get(number) != i){
        answer[0] = i;
        answer[1] = map.get(number);
        break;
      }
    }
    return answer;
  }
}