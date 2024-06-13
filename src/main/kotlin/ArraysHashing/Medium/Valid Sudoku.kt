package ArraysHashing.Medium

fun isValidSudoku(board: Array<CharArray>): Boolean {
    val cols = mutableMapOf<Int, MutableSet<Char>>()
    val rows = mutableMapOf<Int, MutableSet<Char>>()
    val squares = mutableMapOf<Pair<Int, Int>, MutableSet<Char>>()

    for (r in 0..8) {
        for (c in 0..8) {
            val value = board[r][c]

            if (value == '.') continue

            if (r in rows) {
                if (!rows[r]?.add(value)!!) return false
            } else {
                rows[r] = mutableSetOf(value)
            }

            if (c in cols) {
                if (!cols[c]?.add(value)!!) return false
            } else {
                cols[c] = mutableSetOf(value)
            }

            if (Pair(r / 3, c / 3) in squares) {
                if (!squares[Pair(r / 3, c / 3)]?.add(value)!!) return false
            } else {
                squares[Pair(r / 3, c / 3)] = mutableSetOf(value)
            }
        }
    }


    return true
}

/*
isValidSudoku(
            arrayOf(
                charArrayOf('5', '3', '.', '.', '7', '.', '.', '.', '.'),
                charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
                charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
                charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
                charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
                charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
                charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
                charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
                charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
            )
        )
 */