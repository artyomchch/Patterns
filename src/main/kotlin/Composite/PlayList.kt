package Composite

class PlayList(val title:String):IMedia {
    var movieList:MutableList<IMedia> = mutableListOf()
    var nameFilm = title

    fun addNewMedia(media:IMedia) = movieList.add(media)
    fun removeMedia(media: IMedia){
        movieList = movieList.filter{ it.getName() != media.getName() }.toMutableList()
    }

    override fun play() {
        movieList.forEach { it.play() }
    }

    override fun displaySubtitle() {
        println("Отображать субтитры")
    }

    override fun setPlaySpeed(speed: Float) {
        movieList.forEach { it.setPlaySpeed(speed) }
    }

    override fun getName(): String {
        return nameFilm
    }
}
