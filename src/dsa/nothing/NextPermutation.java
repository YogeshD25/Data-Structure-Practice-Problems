package dsa.nothing;

public class NextPermutation {

    public static void main(String args[]) {

        int inputArr[] = {1,2,3,4};

        findNextPermutation(inputArr);


    }

    private static void findNextPermutation(int[] inputArr) {


        int size = inputArr.length-1;

        int tempIndex = 0;

        while(size !=0){

            if(inputArr[size]> inputArr[size-1] ){
                 tempIndex = size-1;

                int temp2 = inputArr.length-1;
                while(temp2!=tempIndex){
                    if(inputArr[temp2]>inputArr[tempIndex]){
                        int temp = inputArr[temp2];
                        inputArr[temp2] = inputArr[tempIndex];
                        inputArr[tempIndex] = temp;
                        break;
                    }
                    temp2--;
                }
                break;



            }

            size--;
        }


        System.out.println("ZZZZZZZZZZZZZ");

        for (int i=0;i<=tempIndex;i++){
            System.out.println(inputArr[i]);
        }

        for (int i=inputArr.length-1;i>tempIndex;i--){
            System.out.println(inputArr[i]);
        }

        System.out.println("ZZZZZZZZZZZZZ");




    }
}
