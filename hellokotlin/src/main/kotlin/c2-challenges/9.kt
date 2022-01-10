package `c2-challenges`

import kotlin.math.*
// Distance between two points
const val x1: Double = 2.0
const val y1: Double = 3.0
const val x2: Double = 4.0
const val y2: Double = 5.0

var Distance: Double = sqrt(((x2 - x1) * (x2 - x1))) + (((y2 - y1) * (y2 - y1)))
fun main() {
    println(Distance)
}
