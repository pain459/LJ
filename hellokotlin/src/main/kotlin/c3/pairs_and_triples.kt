package c3

// pairs
val coordinates: Pair<Int, Int> = Pair(2, 3)
val coordinatedInferred = Pair(2, 3)
val coordinatesWithTo = 2 to 3
val coordinatesDoubles = Pair(2.5, 3.5)
val coordinatesDoublesMixed = Pair(2.5, 4)

// Accessing the same
val x1 = coordinatesDoublesMixed.first
val y1 = coordinatesDoublesMixed.second

// access in a line
// Also an example of triple
fun main() {
    val (x, y) = coordinates
    println("$x $y")
    val (a, b, c) = Triple(1, 2, 3)
    println("$a, $b, $c")
}

