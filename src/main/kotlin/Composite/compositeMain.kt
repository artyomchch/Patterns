package Composite

fun main(){
    val actionMoviePlayList:PlayList = PlayList("Action Movies")
    val movieB:IMedia = Movie("The Dark Knight")
    val movieC:IMedia = Movie("Inception")
    val movieD:IMedia = Movie("The Matrix")

    actionMoviePlayList.apply {
        addNewMedia(movieB)
        addNewMedia(movieC)
        addNewMedia(movieD)
    }

    val dramaPlayList:PlayList = PlayList("Drama Play List")
    val movie1:IMedia = Movie("The Godfather")
    val movie2:IMedia = Movie("The Shawshank Redemption")
    dramaPlayList.apply { addNewMedia(movie1);addNewMedia(movie2) }

    val myPlayList:PlayList = PlayList("My Play List")
    myPlayList.apply {
        addNewMedia(actionMoviePlayList)
        addNewMedia(dramaPlayList)
    }

    myPlayList.play()

}