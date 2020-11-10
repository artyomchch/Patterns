package Builder

class Composition {
    private var beef:String? = null
    private var salad:Int? = null
    private var tomatoes:Double? = null
    private var bread:Boolean? = null
    private var souse:String? = null
    private var dough:Boolean? = null

    fun setBeef(beef: String?){
        this.beef = beef
    }
    fun getBeef():String?{
        return this.beef
    }
    fun setSalad(salad: Int?){
        this.salad = salad
    }
    fun getSalad():Int?{
        return this.salad
    }
    fun setTomatoes(tomatoes: Double?){
        this.tomatoes = tomatoes
    }
    fun getTomatoes():Double?{
        return this.tomatoes
    }
    fun setBread(bread:Boolean){
        this.bread = bread
    }
    fun getBread():Boolean?{
        return this.bread
    }
    fun setSouse(souse:String){
        this.souse = souse
    }
    fun getSouse():String?{
        return this.souse
    }
    fun setDough(dough:Boolean){
        this.dough = dough
    }
    fun getDough():Boolean?{
        return this.dough
    }




}