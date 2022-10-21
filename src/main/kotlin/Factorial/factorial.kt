package Factorial

object factorial {
    @JvmStatic
    fun main(args: Array<String>) {
        val num = 8
        val factorial = multiplyNumbers(num)
        println("Factorial of $num = $factorial")
    }

    fun multiplyNumbers(num: Int): Long {
        return if (num >= 1) num * multiplyNumbers(num - 1) else 1
    }
}