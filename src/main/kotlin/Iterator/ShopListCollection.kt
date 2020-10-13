package Iterator

class ShopListCollection {
    private val products = ArrayList<Shop>()

    fun add(shop: Shop) {
        products.add(shop)
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