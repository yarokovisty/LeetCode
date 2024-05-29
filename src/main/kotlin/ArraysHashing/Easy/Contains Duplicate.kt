package ArraysHashing.Easy

fun containsDuplicate(nums: IntArray): Boolean {
    val set = mutableSetOf<Int>()

    for (num in nums) {
        if (!set.add(num)) return true
    }

    return false

}

