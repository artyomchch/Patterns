package Iterator

class ShopListCollection {
    private val products = ArrayList<Shop>()

    fun add(shop: Shop) {
        products.add(shop)
    }

    fun move(id: Int): String{

        for (i in products){
            val parts = products[id].toString().split(" ")
            println(parts)
        }
        return products[id].toString()
    }

    fun createIterator() = ListIterator(this)

    class ListIterator(private val collection: ShopListCollection) : Iterator {

        private var index = 0

        override fun next(): Shop {
            return collection.products[index++]
        }

        override fun hasNext(): Boolean {
            return index < collection.products.size
        }
    }
}