package dsa


/**
 *
 *
 * Move all non-zeros present in an array to the end
 * Input:  {6, 0, 8, 3, 0, 4, 0, 1}
 * Output: {0, 0, 0, 6, 8, 3, 4, 1}
 *
 * 1
 *
 * l r
 * 6 0 8 3 0 4 0 1
 *
 * 2
 *   l r
 * 0 6 8 3 0 4 0 1
 *
 * 3
 *    l   r
 *  * 0 6 8 3 0 4 0 1
 *
 *       l   r
 * 6 3 4 0 0 1
 *
 *
 *  arr[r] ==0
 *
 * 0 6 3 0 4 0 1
 *
 * 0 0 6 3 4 0 1
 *
 * l
 * r
 *
 *
 *
 * list1[]
 * list2[]
 *
 */


fun main(){
    var arr = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
    sort0PositionArray(arr)
}
fun sort0PositionArray(arr: Array<Int>){

    var l = 0
    var r = 1

    while(l<=r && r<= arr.size-1){

        if(arr[l] == 0 && arr[r] != 0){
            //swap

            var temp = arr[l]
            arr[l] = arr[r]
            arr[r] = temp

            l++
            r++
        } else if(arr[l] == 0 && arr[r] == 0){
            r++
        } else {
            l++
            r++
        }

    }

    for(i in arr){
        println(i)
    }

}


/**


fun fact(n: Int): Int {
   return if (n <= 1)
       1
   else
       n * fact(n - 1)
}


 */


/****
 *
 *
 *
 *
 *  Student
 *
 *  name    key
 *
 *  Yogesh   a
 *
 *
 *  Student/ Subject
 *
 *
 *  id subId
 *   a    01
 *   a    02
 *   a    03
 *
 *  Subject
 *
 *  name , subId
 *
 *  English 01
 *  Hindi   02
 *  Marathi 03
 *
 *
 *  select * from student
 *
 *
 *
 */



