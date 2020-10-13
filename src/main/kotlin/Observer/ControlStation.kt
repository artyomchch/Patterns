package Observer

import java.util.*
import kotlin.random.Random

class ControlStation(){
    private val product: MutableList<ManBehavior> = LinkedList()
    var course = 0

    fun addProduct(manBehavior: ManBehavior){
        product.add(manBehavior)
    }

    fun removeMan(manBehavior: ManBehavior){
        product.remove(manBehavior)
    }

    fun updateWeather(){
        course = Random.nextInt(70, 80)
        product.forEach{
            it.getPrice(course = course)
        }
        Thread.sleep(1000)
        updateWeather()

    }
}