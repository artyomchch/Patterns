package AbstractFactory

class PizzaCookFactory : CookFactory {
    override fun getInstance(name: String) : PizzaCook {
        return when (name){
            "Дмитрий" -> Dmitry()
            "Jr" -> Kirill()
            else -> throw IllegalArgumentException("No class available for $name")
        }
    }

    private class Dmitry : PizzaCook {
        override val name: String
            get() = "Дмитрий"

        override fun cook() {
            println("Дмитрий готовит пиццу")
        }

    }

    private class Kirill : PizzaCook {

        override val name: String
            get() = "Кирилл"

        override fun cook() {
            println("Кирилл начал танцевать, а не готовить пиццу")
        }
    }
}