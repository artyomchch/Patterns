package Composite

import Proxy.qualityDistribution

fun main(){

    var selQuality = "Some Video" to "720"
    var checkVideo = qualityDistribution()
    checkVideo.sendVideo(selQuality)
    println()



    val actionMoviePlayList:PlayList = PlayList("Плейлсит: Боевики")

    actionMoviePlayList.setPlaySpeed(1.5f)
    val movieB:IMedia = Movie("Темный рыцарь")
    val movieC:IMedia = Movie("Начало")
    val movieD:IMedia = Movie("Матрица")

    actionMoviePlayList.apply {
        addNewMedia(movieB)
        addNewMedia(movieC)
        addNewMedia(movieD)
    }

    val dramaPlayList:PlayList = PlayList("Плейлист: Драма")

    val movie1:IMedia = Movie("Крестный отец")
    val movie2:IMedia = Movie("Побег из шоушенка")
    dramaPlayList.apply {
        addNewMedia(movie1);
        addNewMedia(movie2) }

    val myPlayList:PlayList = PlayList("Мой плейлист:")




    myPlayList.apply {
        println(actionMoviePlayList.getName())
        actionMoviePlayList.setPlaySpeed(1.2f)
        println()
        addNewMedia(actionMoviePlayList)
        println(dramaPlayList.getName())
        dramaPlayList.setPlaySpeed(1.5f)
        addNewMedia(dramaPlayList)
        myPlayList.displaySubtitle()

        println()
    }



    myPlayList.play()
    //myPlayList.displaySubtitle()



}