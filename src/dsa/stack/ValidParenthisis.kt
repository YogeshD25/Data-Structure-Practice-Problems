package dsa.stack

import java.util.*

fun main() {
    println(isValid("{()}"))
}

fun isValid(s: String): Boolean {

    var parenCharStack = Stack<String>();

    for (ch in s) {
        if (ch == '{') {
            parenCharStack.push("}")

        } else if (ch == '(') {
            parenCharStack.push(")")

        } else if (ch == '[') {
            parenCharStack.push("]")

        } else if (parenCharStack.isEmpty() || ch.toString() != parenCharStack.pop()) {
            return false
        }
    }
    return parenCharStack.isEmpty()
}