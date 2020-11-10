package AbstractFactory

interface CookFactory {
    fun getInstance(name : String) : Cook
}