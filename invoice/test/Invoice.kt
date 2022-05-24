import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.doubles.shouldBeExactly
import io.kotest.matchers.shouldBe

class InvoiceTest : StringSpec() {
    init {

        "total for a cancelled ride" {
            val rideOne = Ride(0.0, 0.0)
            Invoice(listOf(rideOne)).totalFair shouldBeExactly  0.0
        }

        "total for 1 kms and 21 mi̦nutes should be Rs.21" {
            val rideOne = Ride(0.0, 0.0)
            val rideTwo = Ride(1.0, 1.0)
            val rideThree  = Ride(0.0, 10.0)
            Invoice(listOf(rideOne, rideTwo, rideThree)).totalFair shouldBeExactly  21.0
        }

        "total for 1kms and 11 mi̦nutes should be Rs.21" {
            val rideOne = Ride(0.0, 10.0)
            val rideTwo = Ride(1.0, 1.0)
            Invoice(listOf(rideOne, rideTwo)).totalFair shouldBeExactly  21.0
        }

        "total for 1.32kms and 33 mi̦nutes should be Rs.46.2" {
            val rideOne = Ride(0.32, 10.0)
            val rideTwo = Ride(1.0, 23.0)
            Invoice(listOf(rideOne, rideTwo)).totalFair shouldBeExactly  46.2
        }

        "No ride at all" {
            Invoice(listOf()).totalFair shouldBeExactly 0.0
        }

        "Average fair for 2 Rides" {
            val rideOne = Ride(0.32, 10.0)
            val rideTwo = Ride(1.0, 23.0)
            Invoice(listOf(rideOne, rideTwo)).avgFair shouldBeExactly  23.1
        }

        "Average fair for 0 rides" {
            Invoice(listOf()).avgFair shouldBeExactly  0.0
        }

        "number of rides for 2 rides" {
            Invoice(listOf(Ride(0.32, 10.0), Ride(1.0, 23.0))).numOfRides shouldBe 2
        }

        "number of rides for 0 rides" {
            Invoice(listOf()).numOfRides shouldBe 0
        }

    }
}
