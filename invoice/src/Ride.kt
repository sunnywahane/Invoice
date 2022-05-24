const val DISTANCE_RATE = 10
const val TIME_RATE = 1
class Ride(val distance: Double, val time: Double) {
    fun calculateFair(): Double {
        return this.distance * DISTANCE_RATE + this.time * TIME_RATE
    }
}
