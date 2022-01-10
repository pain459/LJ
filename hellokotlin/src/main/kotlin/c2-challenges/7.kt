package `c2-challenges`

// Chess board example
const val position: Int = 36
var row: Int = position / 8
var column: Int = position % 8
fun main() {
    println("Position decoded from $position is [$row, $column]")
}