package Strategy

data class Customer(val name: String, val fidelityScore: Int)


fun main(args: Array<String>) {
    val ivan = Customer("Иван Иванов", 900)
    val denis = Customer("Денис Денисов", 1100)

    val niceCheckerCart = listOf(
        LineItem("банан", 20, 10.0),
        LineItem("яблоко", 10, 20.0),
        LineItem("арбуз", 5, 30.0))


    val mediumOrderCart = mutableListOf<LineItem>()
    1.rangeTo(30)
        .map { mediumOrderCart.add(LineItem(it.toString(), 10, 10.0)) }


    val largeOrderCart = listOf(
        LineItem("банан", 30, 10.0),
        LineItem("яблоко", 10, 20.0))




    val ivanOrder = Order(ivan, niceCheckerCart, promo = ::mediumPromo)
    orderDetails(ivanOrder)
    promoInfo(ivanOrder)

    val denisOrder = Order(denis, niceCheckerCart, promo = ::nicePromo)
    orderDetails(denisOrder)
    promoInfo(denisOrder)


    val denisMedium = Order(denis, mediumOrderCart, promo = ::mediumPromo)
    orderDetails(denisMedium)
    promoInfo(denisMedium)

    val ivanLarge = Order(ivan, largeOrderCart, promo = ::largePromo)
    orderDetails(ivanLarge)
    promoInfo(ivanLarge)


}





/**
* Скидка 5% для клиентов с 1000 и более баллов лояльности
*/
fun nicePromo(order: Order): Double {
    return if (order.customer.fidelityScore > 1000){
        order.total() * 0.05
    }else {
        0f.toDouble()
    }
}



/**
 * Скидка 7% на заказы от 10 и более различных товаров
 */
fun mediumPromo(order: Order): Double {
    val uniqueItems = order.cart.toSet().size
    return if (uniqueItems >= 10) {
        order.total() * 0.07
    }else {
        0f.toDouble()
    }
}


/**
* Скидка 10% за каждый элемент с 20 и более единицами
*/
fun largePromo(order: Order): Double {
    var discount:Double = 0f.toDouble()

    for(item in order.cart) {
        if(item.qtyInKg >= 20) {
            discount += item.total() * 0.1
        }
    }

    return discount
}




fun findBestPromo(order: Order, promos: List<(Order)->Double>):
        Sequence<Pair<String, Double>>
{
    return promos.asSequence()
        .map { Pair(it.toString(), it.invoke(order)) }
        .sortedBy { it.second }
}



///

fun promoInfo(ivanOrder: Order) {
    val promos = listOf(::nicePromo, ::largePromo, ::mediumPromo)
    val data = findBestPromo(ivanOrder, promos)
    println()
    for (item in data) {
        println("[ Алгоритм: ] ${item.first}, [ Скидка: ] ${item.second}")
    }
}

fun orderDetails(order: Order) {
    println("########################################")
    println()
    println("Детали заказа ")
    println("Имя покупателя: ${order.customer.name}")
    //println("Расчитанно с помощью: ${order.promo}")
    for (item in order.cart) {
        println("Продукт: ${item.productName} [ ${item.qtyInKg} ]")
    }
    println("Текущая цена: ${order.total()}")
    println("Цена со скидкой: ${order.finalPrice()}")
    println()
}