class InvoiceGenerator {
    fun calculateTotalFair(Rides: List<Ride>): Double {
        return Rides.sumOf { it.calculateFair() }
    }
}
