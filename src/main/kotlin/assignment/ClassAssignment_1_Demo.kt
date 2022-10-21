package assignment

object ClassAssigenment_1_Demo {
    @JvmStatic
    fun main(args: Array<String>) {
        print("**Assignment on Class**\n\n ")
        val car = MyVehicle(4, 4)
        val motorCycle = MyVehicle(2, 0)
        print("Car ")
        car.showVehicle()
        print("Motorcycle ")
        motorCycle.showVehicle()
    }
}