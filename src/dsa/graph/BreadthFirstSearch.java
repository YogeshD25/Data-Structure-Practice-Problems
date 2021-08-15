package dsa.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.*;
import java.util.Queue;

public class BreadthFirstSearch {
    public static void main(String[] args) throws Exception {

        int row, col, i, j;

        Scanner in = new Scanner(System.in);
        row = in.nextInt();
        col = in.nextInt();

        int[][] array = new int[row][col];


        for (i = 0; i < row; i++)
            for (j = 0; j < col; j++)
                array[i][j] = in.nextInt();


        int[] start = {0, 0};
        int[] dest = {1, 1};


        System.out.println("The Element present anf reachable or not is " + findBFS(array, start, dest));
    }

    private static int findBFS(int[][] arr, int[] start, int[] dest) {
        Queue<String> queue = new LinkedList<String>();
        HashMap<String, Integer> map = new HashMap<>();


        map.put(start[0] + "#" + start[1], 1);
        queue.add(start[0] + "#" + start[1] + "#" + 0);

        int rowLength = arr.length;
        int colLength = arr[0].length;

        int i = 0, j = 0, step = 0;
        while (!queue.isEmpty()) {
            i = Integer.parseInt(queue.peek().split("#")[0]);
            j = Integer.parseInt(queue.peek().split("#")[1]);
            step = Integer.parseInt(queue.peek().split("#")[2]);
            if (arr[i][j] == arr[dest[0]][dest[1]]) {
                return step;
            }
            System.out.println("Rear: " + arr[i][j]);

            queue.remove(queue.peek());


            if (i + 1 < rowLength && !map.containsKey((i + 1) + "#" + j) && arr[i + 1][j] != 0) {
                map.put((i + 1) + "#" + j, 1);
                queue.add((i + 1) + "#" + j + "#" + (step + 1));
            }
            if (j - 1 >= 0 && !map.containsKey((i) + "#" + (j - 1)) && arr[i][j - 1] != 0) {
                map.put(i + "#" + (j - 1), 1);
                queue.add(i + "#" + (j - 1) + "#" + (step + 1));
            }
            if (j + 1 < colLength && !map.containsKey((i) + "#" + (j + 1)) && arr[i][j + 1] != 0) {
                map.put(i + "#" + (j + 1), 1);
                queue.add(i + "#" + (j + 1) + "#" + (step + 1));
            }
            if (i - 1 >= 0 && !map.containsKey((i - 1) + "#" + j) && arr[i - 1][j] != 0) {
                map.put((i - 1) + "#" + j, 1);
                queue.add((i - 1) + "#" + j + "#" + (step + 1));
            }

        }

        return -1;
    }
}
