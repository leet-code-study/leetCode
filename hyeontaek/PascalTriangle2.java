package hyeontaek;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i <= rowIndex; i++){
            list.add(1);
            for(int j = i - 1; j > 0; j--){
                list.set(j, list.get(j) + list.get(j - 1));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        PascalTriangle2 solution = new PascalTriangle2();
        System.out.println(solution.getRow(3));
    }

}
