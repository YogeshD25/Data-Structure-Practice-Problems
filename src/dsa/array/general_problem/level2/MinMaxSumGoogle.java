package dsa.array.general_problem.level2;

import java.util.*;

public class MinMaxSumGoogle {
    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(1);

        solve(list);


    }

    public static int solve(ArrayList<Integer> A) {
        int sum =0;
        Collections.sort(A);
        sum = A.get(0) + A.get(A.size()-1);
        return sum;
    }

}
