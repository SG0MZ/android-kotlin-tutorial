fun main(args: Array<String>) {
    println("Hello World")
    println("My first Kotlin program")

    println()

    val jim = "James T Kirk"
    val tim = "Tim Buchalka"
    println("My name is $tim")
    println("I can print \$tim")

    println()

    val timWeeklySalary = 32
    val timMonthlySalary = timWeeklySalary * 4
    println("Tim's $ weekly salary is $$timWeeklySalary")
    println("Monthly, that comes to $timMonthlySalary")

    println()

    val apples = 6
    val oranges = 5
    val fruit = apples - oranges
    println("$apples apples - $oranges oranges leaves $fruit piece(s) of fruit")

    println("A quarter of the apples is ${apples / 4}")

    println()
    val weeks = 130
    val years = weeks / 52.0
    println("$weeks weeks is $years years")
}
