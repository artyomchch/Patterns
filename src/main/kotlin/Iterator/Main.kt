package Iterator

fun main() {
    val collection = ShopListCollection()
   // val collection = ProductArrayCollection()

    collection.add(Shop(1, "Ашан"))
    collection.add(Shop(2, "Перекресток"))
    collection.add(Shop(3, "Дикси"))
    collection.add(Shop(4, "Пятерочка"))
    collection.add(Shop(5, "Глобус"))
    collection.add(Shop(6, "Лента"))
    collection.add(Shop(7, "Метро"))

    val iterator = collection.createIterator()

    while (iterator.hasNext()){
        val currentProduct = iterator.next()
        println(currentProduct.toString())
    }
}