fun main(args: Array<String>) {
    val car1=BMW("BMW X5","RED",155.0)
    val car2=tesla("Tesla S","Green",145.0)
    println("The fuletype for ${car1.model} is ${car1.getfuletype()} and made in ${car1.theCountryOfManufacture()}")
    println("The fuletype for ${car2.model} is ${car2.getfuletype()} and made in ${car2.theCountryOfManufacture()}")

}