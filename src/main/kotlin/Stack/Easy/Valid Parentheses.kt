package Stack.Easy
import java.util.Stack


fun isValid(s: String): Boolean {
    val  stack = Stack<Char>()
    val map = mapOf('(' to ')', '[' to ']', '{' to '}')

    s.forEach { c ->
        if (c in map) {
            stack.add(c)
        } else {
            if (stack.isEmpty()) return false
            if (map[stack.pop()] != c) return false
        }
    }

    return stack.isEmpty()
}
