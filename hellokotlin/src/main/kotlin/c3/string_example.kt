package c3
// mind the quotes.
var string1: Char = 'a'
var string2: String = "Dog say bow bow"

// string concatenation
var string3: String = string1 + " " + string2  // can be converted into string template too.

var string4 = """
    |This is a
    |very big
    |statement.
""".trimMargin()

fun main() {
    println(string3)
    println(string4)
}

