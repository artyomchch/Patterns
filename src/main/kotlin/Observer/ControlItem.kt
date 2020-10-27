package Observer

import java.util.*
import kotlin.random.Random

class ControlItem(){
    private val product: MutableList<ManBehavior> = LinkedList()
    var course = 0

    fun addProduct(manBehavior: ManBehavior){
        product.add(manBehavior)
    }

    fun removeMan(manBehavior: ManBehavior){
        product.remove(manBehavior)
    }

    fun updatePrice(){
        course = Random.nextInt(70, 80)
        product.forEach{
            it.getPrice(course)
        }
        //Thread.sleep(1000)
      //  updatePrice()

    }
}