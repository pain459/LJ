package `c2-challenges`

fun main() {
    val a: Int = 46
    val b: Int = 10
    // 1
    val answer1: Int = (a * 100) + b
    val answer2: Int = (a * 100) + (b * 100)
    val answer3: Int = (a * 100) + (b / 10)
    println("Answer1 $answer1\n" +
            "Answer2 $answer2\n" +
            "Answer3 $answer3\n")
}