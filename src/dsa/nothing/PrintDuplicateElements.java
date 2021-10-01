package dsa.nothing;

import java.util.ArrayList;
import java.util.HashMap;
public class PrintDuplicateElements {

    public static void main(String args[]){

        /**
         *
         * Input Here
         *
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(1);

        printDuplicateElements(list);

    }

    private static void printDuplicateElements(ArrayList<Integer> list) {

        HashMap<Integer,Integer> tempMap = new HashMap<>();


        for(Integer a : list){
            if(tempMap.containsKey(a)){
                tempMap.put(a,tempMap.get(a)+1);
            }else {
                tempMap.put(a, 1);
            }
        }
        for (Integer a : tempMap.keySet()){
            if(tempMap.get(a)>1){
                System.out.println(a);
            }
        }
    }
}
