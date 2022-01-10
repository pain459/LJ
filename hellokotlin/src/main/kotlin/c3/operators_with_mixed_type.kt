package c3

var hourlyRate: Double = 15.5
var hoursWorked: Int = 67
var totalSalary: Double = hourlyRate * hoursWorked.toDouble()

fun main() {
    println("Total salary is $totalSalary")
}