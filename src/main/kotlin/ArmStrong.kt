fun main(args: Array<String>){
    val number =371
    var originalInteger:Int
    var remainder:Int
    var result =0

    originalInteger = number

    while (originalInteger != 0){
        remainder = originalInteger % 10
        result += Math.pow(remainder.toDouble(),3.0).toInt()
        originalInteger /= 10

    }
    if (result == number)
        println("$number is an Armstrong number.")
    else
        println("%number is not Armstrong number.")
}