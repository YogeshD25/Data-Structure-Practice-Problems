package dsa.queue.general;

import java.util.Scanner;

public class PetrolPumpProblem {

    public static void main(String[] args) {

        int input[][] = {{6, 4}, {3, 6}, {7, 3}};
        int start = 0;
        int end = 1;

        Scanner sc = new Scanner(System.in);
        sc.nextInt();

        System.out.println(findCircleFormationPossibleOrNot(input, start, end, input.length));



    }

    private static int findCircleFormationPossibleOrNot(int[][] input, int start, int end, int length) {

        int curr_petrol =(input[start][0] - input[start][1]);
        while (true) {
            if (start == end && curr_petrol > 0) {
                return start;
            } else {

                if (curr_petrol < 0) {
                    curr_petrol = curr_petrol - (input[start][0] - input[start][1]);
                    start = (start + 1) % length;
                    if (start == 0)
                        return -1;
                } else {
                    curr_petrol = curr_petrol + (input[end][0] - input[end][1]);
                    end = (end + 1) % length;
                }
            }

        }


    }
}
