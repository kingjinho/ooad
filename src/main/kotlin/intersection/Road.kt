package intersection

class Road @JvmOverloads constructor(
    private val numberOfIncomingLane: Int,
    private val numberOfOutgoingLane: Int,
    private var crosswalk: Crosswalk? = null
) {
    init {
        require((numberOfIncomingLane >= 0 && numberOfOutgoingLane >= 0)
                && numberOfIncomingLane + numberOfOutgoingLane > 0)
    }

    val isOneWay: Boolean
        get() = numberOfIncomingLane == 0 || numberOfOutgoingLane == 0
    val hasCrosswalk: Boolean
        get() = crosswalk != null

    fun setCrosswalk(crosswalk: Crosswalk) {
        this.crosswalk = crosswalk
    }

}