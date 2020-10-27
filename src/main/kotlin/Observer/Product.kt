package Observer

import Iterator.Shop


data class Product(val prod1: String, val prod2: String, val prod3: String, val prod4: String, val prod5: String): ManBehavior {
    var courseAnalysis = 75

    override fun getPrice(course: Int) {
        when {
            prod1 == "---" -> {
               // println(prod2)
                println("Отсутствует товар: \"Молоко\" ")
            }
            prod2 == "---" -> {
                println("Отсутствует товар: \"Масло\" ")
            }
            prod3 == "---" -> {
                println("Отсутствует товар: \"Кофе\" ")
            }
            prod4 == "---" -> {
                println("Отсутствует товар: \"Апельсин\" ")
            }
            prod5 == "---" -> {
                println("Отсутствует товар: \"Мука\"")
            }
            else -> println("Все товары присутсвуют")
        }
    }

}