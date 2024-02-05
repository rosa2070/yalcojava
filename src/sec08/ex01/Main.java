package sec08.ex01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer int1 = Integer.valueOf(1);
        Integer int2 = Integer.valueOf(2);
        Integer int3 = Integer.valueOf(3);

        //  대상보다 작을 때: -1, 같을 때 0, 클 때: 1
        int _1_comp_3 = int1.compareTo(3);
        int _2_comp_1 = int2.compareTo(1);
        int _3_comp_3 = int3.compareTo(3);
        int _t_comp_f = Boolean.valueOf(true).compareTo(Boolean.valueOf(false));
        int _abc_comp_def = "ABC".compareTo("DEF");
        int _def_comp_abc = "efgh".compareTo("abcd");

        Integer[] nums = {3, 8, 1, 7, 4, 9, 2, 6, 5};
        String[] strs = {
                "Fox", "Banana", "Elephant", "Car", "Apple", "Game", "Dice"
        };

        //  ⭐️ Arrays 클래스의 sort 메소드
        //  - 기본적으로 compareTo에 의거하여 정렬
        //  - 인자가 없는 생성자로 생성된 TreeSet, TreeMap도 마찬가지
        Arrays.sort(nums);
        Arrays.sort(strs);

        Arrays.sort(nums, new IntDescComp());
    }
}
