package Proxy

import kotlin.random.Random

class qualityProxy : IVideo {
    var network = 0

    private var quality = listOf(
            SortingQuality("480",false),
            SortingQuality("720",false),
            SortingQuality("1080",false),
            SortingQuality("1440",false),
            SortingQuality("2160",false),
    )


    fun updateNetwork(){
        network = Random.nextInt(1, 230)
        println("Скорость интернета: ${network} Mbps")
        quality.forEach{
            if ( network*10 > it.quality.toIntOrNull()!!){
                it.isNetwork = true
            }
        }

        }



    override fun sendVideo(bits: Pair<String, String>) {
        updateNetwork()

        try {
            val nearQuality  = quality.filter { it.quality.contains(bits.second,true) && it.isNetwork }.first()
            nearQuality.sendVideo(bits)
        }catch (e: NoSuchElementException){
            println("Фильмы не могут воспроизводиться в данном качетсве --> ${bits.second}p")
        }


    }

}