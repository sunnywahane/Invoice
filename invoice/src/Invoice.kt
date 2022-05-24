data class Invoice(val rides: List<Ride>) {
    val totalFair = rides.sumOf { it.calculateFair() }
    val numOfRides = rides.size
    val avgFair = if (numOfRides ==0 ) 0.0 else totalFair/numOfRides
}
