package dsa.nothing;

import java.util.*;
public class CalculatePin {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        GetCode getCode = new GetCode();
        System.out.println(getCode.getIntCodeFromString(str));

    }


}

class GetCode{
    public int getIntCodeFromString(String str){

        if(!str.contains(" ")){
            return str.length();
        }else{
            String[] array = str.split(" ");

            int ans  = 1;
            for (int i = 0;i< array.length-1;i++){
                ans = ans + array[i].length()+2;
            }
            return ans;
        }

    }
}
