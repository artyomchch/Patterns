package Iterator

import Observer.ControlItem
import Observer.Product

fun main() {
    val collection = ShopListCollection()
   // val collection = ProductArrayCollection()




    collection.add(Shop(1, "Ашан", "Молоко", "---", "Кофе", "Апельсин", "Мука"))
    collection.add(Shop(2, "Перекресток","Молоко", "Масло", "Кофе", "Апельсин", "Мука" ))
    collection.add(Shop(3, "Дикси","Молоко", "---", "Кофе", "Апельсин", "Мука"))
    collection.add(Shop(4, "Пятерочка","Молоко", "Масло", "Кофе", "---", "Мука"))
    collection.add(Shop(5, "Глобус", "---", "Масло", "Кофе", "Апельсин", "Мука"))
    collection.add(Shop(6, "Лента", "Молоко", "Масло", "Кофе", "Апельсин", "Мука"))
    collection.add(Shop(7, "Метро", "Молоко", "Масло", "Кофе", "Апельсин", "---"))

    val iterator = collection.createIterator()

    while (iterator.hasNext()){
        val currentProduct = iterator.next()
        println(currentProduct.toString())

        val controlItem = ControlItem()
        controlItem.addProduct(Product(currentProduct.prod(1),currentProduct.prod(2),
                currentProduct.prod(3),currentProduct.prod(4),currentProduct.prod(5) ))
        controlItem.updatePrice()
    }
}