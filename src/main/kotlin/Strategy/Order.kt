package Strategy

class Order(val customer: Customer, val cart: List<LineItem>, val promo: ((Order) -> Double)? = null) {

    fun total(): Double = cart.asSequence().sumByDouble { it.total() }

    fun finalPrice(): Double {
        val discount = promo?.invoke(this) ?: 0f.toDouble()
        return total() - discount
    }

}