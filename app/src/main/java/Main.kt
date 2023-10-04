fun main(args: Array<String>) {
    println("Hello World")
    println("My first Kotlin program")

    println()

    var tim: String
    tim = "Tim Buchalka"
    println("My name is $tim")
    println("I can print \$tim")

    println()

    var timWeeklySalary: Int = 32
    var timMonthlySalary: Int = timWeeklySalary * 4
    println("Tim's $ weekly salary is $$timWeeklySalary")
    println("Monthly, that comes to $timMonthlySalary")

    println()

    val apples: Int = 6
    val oranges: Int = 5
    var fruit: Int = apples - oranges
    println("$apples apples - $oranges oranges leaves $fruit piece(s) of fruit")

    println("A quarter of the apples is ${apples / 4}")

    println()
    val weeks: Int = 130
    val years: Double = weeks / 52.0
    println("$weeks weeks is $years years")
}
