const val DISTANCE_RATE = 10
const val TIME_RATE = 1

class InvoiceGenerator {
    fun calculateFair(Rides: List<Ride>): Double {
        return Rides.sumOf { it.distance * DISTANCE_RATE + it.time * TIME_RATE }
    }
}
