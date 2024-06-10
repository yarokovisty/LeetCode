package ArraysHashing.Medium

fun topKFrequent(nums: IntArray, k: Int): IntArray {
    // [41, 1, 60, 1, 2, 2, 3, 2]
    // 41:1, 60:1, 1:2,2:3,3:1

    val map = mutableMapOf<Int, Int>()
    val result = mutableListOf<Int>()
    var count = k

    for (num in nums) {
        map[num] = (map[num] ?: 0) + 1
    }


    val sizeList = nums.size + 1
    val list = List(sizeList) { mutableListOf<Int>() }


    map.forEach{ (k, v) ->
        list[v].add(k)
    }

    for (i in sizeList - 1 downTo 0) {
        if (list[i].isNotEmpty() && count > 0) {
            result += list[i]
            count -= list[i].size
        }
    }

    return result.toIntArray()
}