package dsa.array.general_problem.level1

fun main(){

    println(removeDuplicates(intArrayOf(0,0,1,1,1,2,2,3,3,4)))

}
    fun removeDuplicates(num: IntArray): Int {
        val list= mutableListOf<Int>()

        for(i in 0.. num.size-2){
            if(num[i] !=num[i+1]){
                list.add(num[i])
            }
        }
        if(list[list.size-1] != num[num.size-1]) {
            list.add(num[num.size-1])
        }

        return list.size

    }