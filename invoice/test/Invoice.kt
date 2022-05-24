import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.doubles.shouldBeExactly
import io.kotest.matchers.shouldBe

class InvoiceTest : StringSpec() {
    init {

        "total for a cancelled ride" {
            val rideOne = Ride(0.0, 0.0)
            Invoice(listOf(rideOne)).totalFair shouldBeExactly  0.0
            Invoice(listOf(rideOne)).avgFair shouldBeExactly  0.0
            Invoice(listOf(rideOne)).numOfRides shouldBe 1

        }

        "total for 1 kms and 21 mi̦nutes should be Rs.21" {
            val rideOne = Ride(0.0, 0.0)
            val rideTwo = Ride(1.0, 1.0)
            val rideThree  = Ride(0.0, 10.0)
            Invoice(listOf(rideOne, rideTwo, rideThree)).totalFair shouldBeExactly  21.0
            Invoice(listOf(rideOne, rideTwo, rideThree)).avgFair shouldBeExactly  7.0
            Invoice(listOf(rideOne, rideTwo, rideThree)).numOfRides shouldBe 3
        }

        "total for 1kms and 11 mi̦nutes should be Rs.21" {
            val rideOne = Ride(0.0, 10.0)
            val rideTwo = Ride(1.0, 1.0)
            Invoice(listOf(rideOne, rideTwo)).totalFair shouldBeExactly  21.0
            Invoice(listOf(rideOne, rideTwo)).avgFair shouldBeExactly  10.5
            Invoice(listOf(rideOne, rideTwo)).numOfRides shouldBe 2
        }

        "No ride at all" {
            Invoice(listOf()).totalFair shouldBeExactly 0.0
            Invoice(listOf()).avgFair shouldBeExactly  0.0
            Invoice(listOf()).numOfRides shouldBe 0
        }
    }
}
