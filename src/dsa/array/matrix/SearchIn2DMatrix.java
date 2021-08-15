package dsa.array.matrix;

public class SearchIn2DMatrix {
    public static void main(String args[]) {

        int arr[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        int k = 21;

        for (int i = 0; true; i = i) {
            for (int j = arr.length - 1; true; j = j) {
                if (arr[i][j] == k) {
                    System.out.println("Finally i found it!!!!!!");
                    return;
                } else if (arr[i][j] > k) {
                    j--;
                    if (j < 0) {
                        System.out.println("Not Found Awwwwwwwwww!");
                        return;
                    }

                } else {

                    i++;
                    if (i > arr.length-1) {
                        System.out.println("Not Found Awwwwwwwwww!");
                        return;
                    }

                }
            }
        }
    }
}
