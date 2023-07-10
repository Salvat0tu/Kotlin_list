fun main(args: Array<String>) {
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    val numString = numbers.map { num ->
        num.toString()
    }
    numString.forEach { str ->
        println(str)
    }
}