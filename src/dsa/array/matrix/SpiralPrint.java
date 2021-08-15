package dsa.array.matrix;

public class SpiralPrint {
    public static void main(String args[]) {
        int arr[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

//        for(int i=0;i< arr.length;i++){
//            for (int j=0;j< arr.length;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        int T, B, L, R, dir;
        T = 0;
        B = arr.length - 1;
        L = 0;
        R = arr[0].length - 1;
        dir = 0;


        while (T <= B && L <= R) {
            if (dir == 0) {
                for (int i = L; i <= R; i++)
                    System.out.print(arr[T][i]);
                T++;
            } else if (dir == 1) {
                for (int i = T; i <= B; i++)
                    System.out.print(arr[i][R]);
                R--;
            } else if (dir == 2) {
                for (int i = R; i >= L; i--)
                    System.out.print(arr[B][i]);
                B--;
            } else if (dir == 3) {
                for (int i = B; i >= T; i--)
                    System.out.print(arr[i][L]);
                L++;
            }

            dir = (dir + 1) % 4;
        }

    }



}
