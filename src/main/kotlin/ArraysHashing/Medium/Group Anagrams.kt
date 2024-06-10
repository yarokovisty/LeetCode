package ArraysHashing.Medium

fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val map = mutableMapOf<String, ArrayList<String>>()

    for (str in strs) {
        val arr = IntArray(26)

        for (char in str) {
            arr[char - 'a']++
        }

        val key = arr.contentToString()

        if (key in map) map[key]!!.add(str)
        else map[key] = arrayListOf(str)
    }

    return map.values.toList()
}