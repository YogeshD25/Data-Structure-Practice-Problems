package dsa.bit_manipulation.level1

import java.util.*

fun main() {

    var num = 4
    var isBleakNumber = false
    for(i in 14 downTo 1){
        if(num - countSetBits(i) == 0){
            isBleakNumber = true
            break
        }
    }

    if(isBleakNumber) println("0") else println("1")

}

fun countSetBits(num: Int): Int{
    var str = Integer.toBinaryString(num)
    var setBitCount = 0
    for(i in str){

        if(i == '1') setBitCount++

    }

    return setBitCount
}
