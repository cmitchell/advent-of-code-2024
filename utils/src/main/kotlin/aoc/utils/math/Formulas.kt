package aoc.utils.math

fun gcd(n1: Int, n2: Int): Int {
    if (n2 == 0) {
        return n1
    }
    return gcd(n2, n1 % n2)
}

fun lcm(n1: Int, n2: Int): Int  = (n1 * n2) / gcd(n1, n2)
