package AbstractFactory

import Builder.Composition
import Builder.CookItem

fun main(args : Array<String>){
    val burgerFactory = BurgerCookFactory()
    val pizzaFactory = PizzaCookFactory()

    ///////////////////////Алексей///////////////////////
    val composition = Composition()
    composition.setBeef("Говядина")
    composition.setSalad(2)
    composition.setSouse("Кетчуп")
    composition.setBread(true)
    val comp = CookItem(composition)
    println(comp.sort())
    println("-------------------- итог ----------------------")
    var cook = makeCook(burgerFactory, "Алексей")
    cook.cook()
    println("------------------------------------------------")
    println()

    ///////////////////////Татьяна///////////////////////
    val composition1 = Composition()
    composition1.setBeef("Курица")
    composition1.setSalad(2)
    composition1.setSouse("Мазик")
    composition1.setTomatoes(2.5)
    composition1.setBread(true)
    var comp1 = CookItem(composition1)
    println(comp1.sort())

    println("-------------------- итог ----------------------")
    cook = makeCook(burgerFactory, "Татьяна")
    cook.cook()
    println("------------------------------------------------")
    println()

    ///////////////////////Дмитрий///////////////////////

    val composition2 = Composition()
    composition2.setBeef("Мраморная говядина")
    composition2.setSalad(8)
    composition2.setSouse("сырный соус")
    composition2.setTomatoes(4.5)
    composition2.setDough(true)
    var comp2 = CookItem(composition2)
    println(comp2.sort())
    println("-------------------- итог ----------------------")
    cook = makeCook(pizzaFactory, "Дмитрий")
    cook.cook()
    println("------------------------------------------------")
    println()

    ///////////////////////Кирилл///////////////////////
    val composition3 = Composition()
    var comp3 = CookItem(composition3)
    println(comp3.sort())
    println("-------------------- итог ----------------------")
    cook = makeCook(pizzaFactory, "Jr")
    cook.cook()
    println("------------------------------------------------")




}

fun makeCook(factory: CookFactory, name : String) : Cook {
    return factory.getInstance(name)
}