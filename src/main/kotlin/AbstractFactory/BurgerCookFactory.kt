package AbstractFactory

class BurgerCookFactory : CookFactory {
    override fun getInstance(name: String) : BurgerCook {
        return when (name){
            "Алексей" -> Alex()
            "Татьяна" -> Tina()
            else -> throw IllegalArgumentException("No class available for $name")
        }
    }

    /**
     * Bob is one concrete class
     */
    private class Alex : BurgerCook {
        override val name: String
            get() = "Алексей"

        override fun cook() {
            println("Алексей приготовил 2 бургера")
        }

    }

    private class Tina : BurgerCook {
        override val name: String
            get() = "Татьяна"

        override fun cook() {
            println("Татьяна уронила бургер на пол, пока готовила его")
        }

    }
}