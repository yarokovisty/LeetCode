package ArraysHashing.Medium

import kotlin.math.max

fun longestConsecutive(nums: IntArray): Int {
    val numSet = nums.toSet()
    var longest = 0

    nums.forEach{ num ->
        if ((num - 1) !in numSet) {
            var length = 0

            while((num + length) in numSet) {
                length++
            }
            longest = max(length, longest)
        }
    }

    return longest
}