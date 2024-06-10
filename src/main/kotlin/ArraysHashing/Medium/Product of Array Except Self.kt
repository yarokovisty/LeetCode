package ArraysHashing.Medium

fun productExceptSelf(nums: IntArray): IntArray {
    val n = nums.size
    val result = IntArray(n) { 1 }

    var prefix = 1
    for (i in 0..<n) {
        result[i] = prefix
        prefix *= nums[i]
    }

    var postfix = 1
    for (i in n - 1 downTo 0) {
        result[i] *= postfix
        postfix *= nums[i]
    }

    return result
}

