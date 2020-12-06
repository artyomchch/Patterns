package Proxy

class ParcelDispatcher : IShipment {

    // for the seek of simplicity I'll just represent the location
    // with a simple string.
    private var facility = listOf<SortingFacility>(
            SortingFacility("North",true),
            SortingFacility("North West",false),
            SortingFacility("South",false),
            SortingFacility("West",true),
            SortingFacility("East",false)
    )

    override fun dispatchParcel(parcel: Pair<String, String>) {
        val facilityNearTpParcelLocation  = facility.filter { it.location.contains(parcel.second,true) && !it.isWarehouseFull }.first()
        facilityNearTpParcelLocation.dispatchParcel(parcel)
    }

}