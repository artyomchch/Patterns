package Iterator
class ProductArrayCollection {
    private val products = arrayOfNulls<Shop>(10)
    private var count = 0

    fun add(product: Shop) {
        if(count < products.size)
            products[count++] = product
    }

    fun createIterator() = ArrayIterator(this)

    class ArrayIterator(private val collection: ProductArrayCollection) : Iterator {

        private var index = 0

        override fun next(): Shop {
            return collection.products[index++]!!
        }

        override fun hasNext(): Boolean {
            return index < collection.count
        }

    }
}