package dsa.nothing;

public class ReverseInteger {
    public static void main(String args[]) {

        findReverseNumber(1234);

    }

    private static void findReverseNumber(int s) {
        int reverse = 0;

        while (s != 0) {
            int remainder = s % 10;
            reverse = reverse * 10 + remainder;
            s = s / 10;

        }
    }
}
