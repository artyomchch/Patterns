package Builder

class CookItem: Builder {
    var cb: Composition

    constructor(composition: Composition) {
        this.cb = composition
    }

//    fun build(): String {
//
//        return ("Необходимые ингридиенты для бургеров/пиццы:" +
//                "\nМясо : ${cb.getBeef()} " +
//                "\nСалад : ${cb.getSalad()} " +
//                "\nТоматы : ${cb.getTomatoes()} " +
//                "\nХлеб : ${cb.getBread()} " +
//                "\nСоус : ${cb.getSouse()}"
//                )
//        }

    override fun sort():String {
        return ("Необходимые ингридиенты для бургеров/пиццы:" +
                "\nМясо : ${cb.getBeef()} " +
                "\nСалад : ${cb.getSalad()} " +
                "\nТоматы : ${cb.getTomatoes()} " +
                "\nХлеб : ${cb.getBread()} " +
                "\nСоус : ${cb.getSouse()}" +
                "\nТесто : ${cb.getDough()}"
                )
    }

}