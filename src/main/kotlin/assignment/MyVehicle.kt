package assignment

class MyVehicle internal constructor(var no_of_wheels: Int, var no_of_seats: Int) {
    fun showVehicle() {
        print("Description:")
        println("\n***")
        println("It has $no_of_wheels wheels")
        println("It has $no_of_seats seats\n")

    }
}