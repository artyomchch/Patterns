package Iterator

data class Shop(private val id: Int, private val name: String,
                private val prod1: String,
                private val prod2: String,
                private val prod3: String,
                private val prod4: String,
                private val prod5: String,) {
    fun prod(idproduct: Int): String {
        return when (idproduct){
            1 -> {
                prod1
            }
            2 -> {
                prod2
            }
            3 -> {
                prod3
            }
            4 -> {
                prod4
            }
            5 -> {
                prod5
            }


            else -> "df"
        }


    }
    override fun toString() = " $id) Магазин: $name Продукты: $prod1, $prod2, $prod3, $prod4, $prod5"

}