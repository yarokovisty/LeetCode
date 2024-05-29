package ArraysHashing.Easy

fun twoSum(nums: IntArray, target: Int): IntArray {
    val set = mutableSetOf<Int>()
    val map = mutableMapOf<Int, Int>()

    for (i in nums.indices) {
        val num = nums[i]

        if (num in set) {
            return intArrayOf(map[target - num] ?: -1, i)
        } else {
            set.add(target - num)
            map[num] = i
        }
    }

    return intArrayOf(-1, -1)
}