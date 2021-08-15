package dsa.array.imp;

public class RangeUsingSegmentTRee {
    public static void main(String args[]){
        int arr[] = {1,2,5,6,7,9};
        int segArray[] =new int[4*arr.length];
        int q =1;
        int l = 2;
        int h = 4;
        constructTree(arr,segArray,0,0,arr.length-1);

        System.out.println(getSumUtil(segArray,0, 0,arr.length -1,l, h));

        updateRecursionTree(segArray,0, 0,arr.length -1,3,14);
//        for (int i=0;i<segArray.length;i++){
//            System.out.print(segArray[i]+" ");
//        }

        generate2DArray(new int[]{5, 2, 7, 1, 3});
    }

    private static int constructTree(int[] arr, int[] segArray,int pos,int l,int r) {
        if (l==r){
            segArray[pos] = arr[l];
            return arr[l];
        }
        int mid = (l+r)/2;
        segArray[pos] = constructTree(arr, segArray, 2*pos+1, l,mid)
                + constructTree(arr, segArray, 2*pos+2,mid+1,r);
        return segArray[pos];
    }

    private static int getSumUtil(int[] segArray,int si,int sl,int sr,int l,int r){
        if(l<=sl && r>=sr){
            return segArray[si];
        }
        if(sr<l || sl >r){
            return 0;
        }
        int mid = (sl+sr)/2;

        return getSumUtil(segArray,2*si+1,sl,mid,l,r)
                + getSumUtil(segArray,2*si+2,mid+1,sr,l,r);

    }




    private static void updateRecursionTree(int[] segArray,int si,int ql,int qr,int pos,int diff){
        if(ql>pos || qr<pos)
            return;
        segArray[si]+=diff;
        if(ql!=qr){
            int mid = (ql+qr)/2;
            updateRecursionTree(segArray, 2*si+1, ql, mid, pos, diff);
            updateRecursionTree(segArray, 2*si+2, mid+1, qr, pos, diff);
        }


    }

    static void generate2DArray(int[] arr){

        for(int i=0;i< arr.length;i++){
            int leastNum = arr[0];
            for (int j=i;j< arr.length;j++){
                if(leastNum>arr[j]){
                    leastNum = arr[j];
                }
                System.out.print(leastNum);
            }
            System.out.println();
        }
    }
}
