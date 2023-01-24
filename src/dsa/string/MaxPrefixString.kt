package dsa.string

fun main() {
    //var arr = arrayOf(1,0,1,2,0,1,1,0,2)
    //sort(arr)

    //var arr = arrayOf(-1,0,12,0,-1,0,2)
    //sortNegativePositive(arr)


    //var array = arrayOf(1,2,3,7,5)
    //findContinuousSum(array, 12)


    //var array1 = arrayOf(1,2,3,4,5)
    //var array2 = arrayOf(3,2,1,6)
    //unionCount(array1, array2)

    var str = "flower flower flower flower"
    println(findMaxPrefix(str))
}


fun findMaxPrefix(str: String): String{

    val strList = str.split(" ")


    var smallestString = strList[0]


    if(strList.size == 0) return ""
    if(strList.size == 1) return strList[0]

    var result = ""


    var prefix = strList[0]

    for(i in 1..strList.size-1){

        while(strList[i].indexOf(prefix)!=0){
            prefix = prefix.substring(0, prefix.length-1)
        }

    }


    return result

}
