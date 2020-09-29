package Observer


data class Product(val name: String, val price: Double): ManBehavior {
    var courseAnalysis = 75

    override fun getPrice(course: Int) {

        if (course >= courseAnalysis){
            println("Название: $name   Цена в евро: $price   Курс: $course  Цена в рублях: ${course * price} -> цена повышена"  )
            courseAnalysis = course
        }
        else
            println("Название: $name   Цена в евро: $price   Курс: $course  Цена в рублях: ${course * price} -> цена понижена")
            courseAnalysis = course
    }

}