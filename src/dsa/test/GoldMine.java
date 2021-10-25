package dsa.test;


import java.util.*;
public class GoldMine {
    public static void main(String args[]){


        //Input Code
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int p= scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        //Actual Code
        calculateDays(arr,p,n);



    }

    private static void calculateDays(int[] arr, int p, int n) {
        Arrays.sort(arr);
        int first = arr[0];
        int ansDays = p/2*first;
        int reqUnit = p/2;
        int additionalUnit = 0;

        //check for additional days to be adjusted

        while(reqUnit<p) {
            for (int i = 1; i < n; i++) {
                additionalUnit += ansDays/arr[i];
            }
            if(additionalUnit+reqUnit>=p)
                break;
            reqUnit += additionalUnit;
            ansDays = ansDays + first;
        }
        System.out.println(ansDays);
    }
}
