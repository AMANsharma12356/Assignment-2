import java.util.*

internal object Main {
    @JvmStatic
    fun main(args: Array<String>) {

        // create an object of Scanner class
        val input = Scanner(System.`in`)

        // take input from users
        print("Enter the principal: ")
        val principal = input.nextDouble()
        print("Enter the rate: ")
        val rate = input.nextDouble()
        print("Enter the time: ")
        val time = input.nextDouble()
        val interest = principal * time * rate / 100
        println("Principal: $principal")
        println("Interest Rate: $rate")
        println("Time Duration: $time")
        println("Simple Interest: $interest")
        input.close()
    }
}