package hyeontaek;

import java.util.*;
import java.util.ArrayList;

public class PascalTriangle {

  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> list = new ArrayList<>();

    for (int i = 0; i < numRows; i++) {
      List<Integer> list2 = new ArrayList<>();
      for (int j = 0; j <= i; j++) {
        if (j == 0 || j == i) {
          list2.add(1);
        }
        else {
          list2.add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
        }
      }
      list.add(list2);
    }
    return list;
  }

  public static void main(String[] args) {
    PascalTriangle solution = new PascalTriangle();
    System.out.println(solution.generate(5));
  }
}
