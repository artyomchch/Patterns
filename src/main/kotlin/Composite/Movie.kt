package Composite

class Movie(val title:String):IMedia {
    private var speed = 1f

    override fun play() {
        println("Сейчас играет: ${title}...")
    }

    override fun displaySubtitle() {
        println("Отображать субтитры")
    }

    override fun setPlaySpeed(speed:Float) {
        this.speed = speed
        println("Текущая скорость воспроизведения установлена на: $speed")
    }

    override fun getName(): String {
        return title
    }
}
