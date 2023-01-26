package dsa.array.general_problem.level2

import java.util.*


fun getMinDiff(arr: IntArray, n: Int, k: Int): Int {
    Arrays.sort(arr)
    var max = arr[n - 1]
    var min = arr[0]
    var res = max - min
    for (i in 1 until n) {
        max = Math.max(arr[i - 1] + k, arr[n - 1] - k)
        min = Math.min(arr[i] - k, arr[0] + k)
        res = Math.min(res, max - min)
    }
    return res
}
