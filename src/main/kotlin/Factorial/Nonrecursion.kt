package Factorial

class Nonrecursion {
    internal object FactorialExample {
        @JvmStatic
        fun main(args: Array<String>) {
            var i: Int
            var fact = 1
            val number = 5 //It is the number to calculate factorial
            i = 1
            while (i <= number) {
                fact = i * fact
                i++
            }
            println("Factorial of $number is: $fact")
        }
    }
}

