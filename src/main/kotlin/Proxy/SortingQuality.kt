package Proxy

class SortingQuality(val quality:String,var isNetwork:Boolean) : IVideo{


    override fun sendVideo(parcel: Pair<String, String>) {
        println("Фильм воспроиводиться в \"${quality}p\" качестве")
    }

}