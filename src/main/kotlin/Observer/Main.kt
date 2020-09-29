package Observer

fun main (args: Array<String>){
    val controlStation = ControlStation()
    controlStation.addProduct(Product(name = "Молоко", price = 1.25))
    controlStation.addProduct(Product(name = "Масло", price = 3.0))
    controlStation.addProduct(Product(name = "Кофе", price = 5.5))
    controlStation.addProduct(Product(name = "Напиток Гараж", price = 1.0))
    controlStation.updateWeather()

}