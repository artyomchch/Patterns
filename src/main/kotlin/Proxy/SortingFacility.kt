package Proxy

class SortingFacility(val location:String,var isWarehouseFull:Boolean) : IShipment{


    override fun dispatchParcel(parcel: Pair<String, String>) {
        println("${location} facility doing dispatching business...")
    }
}