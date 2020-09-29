package Strategy

data class LineItem(val productName: String, val qtyInKg: Int, val pricePerKg: Double) {
    fun total(): Double {
        return qtyInKg * pricePerKg
    }
}