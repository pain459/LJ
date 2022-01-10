// Naming data, working on variables
const val c: Int = 101  // cannot be declared inside the function.
fun main() {
    val a: Int = 10
    val b: Double = 3.1415
    // a = 100  // Val cannot be reassigned
    var d: Int = 64  // variable can be declared as var
    d = 65
    println(a)
    println(b)
    println(c)
    println(d)
    // Increment and decrement
    var e: Int = 100
    println(e)
    e += 1
    println(e)
    e -= 1
    println(e)
}