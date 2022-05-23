const val DISTANCE_RATE = 10
const val TIME_RATE = 1

class InvoiceGenerator {
    fun calculateFair(distance: Double, time: Double): Double {
        return distance* DISTANCE_RATE + time* TIME_RATE
    }

}
