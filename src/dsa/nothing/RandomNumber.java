package dsa.nothing;

import java.util.ArrayList;

public class RandomNumber {

    long a = 252149039;
    long b = 11;
    long c = 0;


    long rand() {
        long temp = a * c + b;
        c = temp;

        return temp;
    }

}

class TempClass {
    public static void main(String args[]) {
        RandomNumber r1 = new RandomNumber();
        for (int i = 0; i < 1000; i++) {
            System.out.println(r1.rand());
        }
    }
}
