package ArraysHashing.Medium

fun isValidSudoku(board: Array<CharArray>): Boolean {
    val column = 9
    val row = 9

    for (r in 0..<row) {
        val set = mutableSetOf<Char>()
        for (c in 0..<column) {
            if (!set.add(board[r][c]) && board[r][c] != '.') return false
        }
    }

    for (c in 0..column) {
        val set = mutableSetOf<Char>()
        for (r in 0..row) {
            if (!set.add(board[r][c]) && board[r][c] != '.') return false
        }
    }



    return true
}