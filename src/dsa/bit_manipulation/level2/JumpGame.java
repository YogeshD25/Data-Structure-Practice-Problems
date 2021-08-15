package dsa.bit_manipulation.level2;



public class JumpGame {
    public static void main(String args[]) {
//        int arr[] = {1,2,0,3,0,0};
//        int arr[] = {1, 0, 2};
        int arr[] = {3,0,1,2,0,0,1};
        System.out.println(jumpToEnd(arr));

    }

    private static int jumpToEnd(int[] A) {

        int n = A.length;
        int reachable = 0;

        for(int i=0;i<n;++i)
        {
            if(reachable < i)
                return 0;
            reachable = max(reachable,i+A[i]);
        }
        return 1;
    }

    private static int max(int A,int B){
        if(A>B){
            return A;
        }else if (A<B){
            return B;
        }else{
            return A;
        }
    }


}
