class RangeClass {
    fun makeRange(lower: Int, upper: Int): IntArray {
        var lower = lower
        val arr = IntArray(upper - lower + 1)
        for (i in arr.indices) {
            arr[i] = lower++
        }
        return arr
    }

    companion object {
        @JvmStatic
        fun main(arg: Array<String>) {
            val theArray: IntArray
            val theRange = RangeClass()
            theArray = theRange.makeRange(1, 10)
            print("The array: [")
            for (i in theArray.indices) {
                print(theArray[i].toString() + " ")
            }
            println("]")
        }
    }
}