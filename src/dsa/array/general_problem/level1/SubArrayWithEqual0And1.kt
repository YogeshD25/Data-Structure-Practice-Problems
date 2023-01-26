package dsa.array.general_problem.level1

fun main(){

    countSubarryWithEqualZeroAndOne(intArrayOf(10,1,0,0,0,1))

}

    fun countSubarryWithEqualZeroAndOne(arr: IntArray): Int {
        var sum = 0
        var ans = 0
        val map: HashMap<Int, Int> = HashMap<Int, Int>()
        map[0] = 1
        for (a in arr) {
            sum += if (a == 0) {
                -1
            } else {
                1
            }
            if (map.containsKey(sum)) {
                ans += map[sum]!!
                map[sum] = map[sum]!! + 1
            } else {
                map[sum] = 1
            }
        }
        return ans
    }

