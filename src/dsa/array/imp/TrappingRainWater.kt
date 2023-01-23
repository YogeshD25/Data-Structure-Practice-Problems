package dsa.array.imp

fun main() {
    var array = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
    println(trappingRainWater(array))
}
fun trappingRainWater(array: Array<Int>) : Int {

    var lArr = IntArray(array.size){0}
    var rArr = IntArray(array.size){0}

    lArr[0] = array[0]
    rArr[array.size-1] = array[array.size-1]
    var tempMax = array[0]
    for(i in 1 until array.size){
        if(tempMax < array[i]) {
            tempMax = array[i]
        }
        lArr[i] = tempMax
    }

    tempMax = array[array.size-1]
    for(i in array.size-2 downTo  0){
        if(tempMax < array[i]) {
            tempMax = array[i]
        }
        rArr[i] = tempMax
    }
    for(i in lArr){
        print("$i ")
    }
    println()
    for(i in rArr){
        print("$i ")
    }
    println()

    var trappedWaterAnswer = 0
    for(i in 0 until array.size){

        trappedWaterAnswer += Math.min(lArr[i], rArr[i]) - array[i]
        println("Trapped Water in each case ${Math.min(lArr[i], rArr[i]) - array[i]}")

    }

    return trappedWaterAnswer

}