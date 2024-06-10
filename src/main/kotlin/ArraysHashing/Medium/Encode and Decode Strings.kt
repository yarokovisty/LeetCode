package ArraysHashing.Medium

class EncodeDecodeStrings {
    private val listLenWords = mutableListOf<Int>()

    fun encode(strs: List<String>): String {
        for (str in strs) {
            listLenWords.add(str.length)
        }

        return strs.joinToString("")
    }

    fun decode(str: String): List<String> {
        var index = 0
        val result = mutableListOf<String>()

        for (len in listLenWords) {
            result.add(str.substring(index..<index + len))
            index += len
        }

        listLenWords.clear()

        return result
    }
}