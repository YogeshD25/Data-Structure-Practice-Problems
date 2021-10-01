package dsa.nothing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;

public class PrimeFactors {

    public static  void main(String args[]){

        Scanner sc =new Scanner(System.in);

        int n= sc.nextInt();

        calculatePrimeFactors(n);
    }

    private static void calculatePrimeFactors(int n) {

        int input = n;

        List<Integer> list = new ArrayList<>();

        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                list.add(i);
                n /= i;
            }
        }
        if (n > 2){
            list.add(n);
        }


        double tempSquare = Math.sqrt(input);

        Collections.sort(list);
        double tempMaxPrimefactor = list.get(list.size()-1);

        if(tempMaxPrimefactor>=tempSquare){
            System.out.print("Strange");
        }else{
            System.out.print("Not Strange");
        }


    }
}
