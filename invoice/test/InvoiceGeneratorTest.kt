import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.doubles.shouldBeExactly

class InvoiceGeneratorTest : StringSpec() {
    init {

        "total for 0 kms and 0 mi̦nutes should be Rs.0" {
            val rideOne = Ride(0.0, 0.0)
            InvoiceGenerator().calculateTotalFair(listOf<Ride>(rideOne)) shouldBeExactly 0.0
        }

        "total for 1 kms and 21 mi̦nutes should be Rs.21" {
            val rideOne = Ride(0.0, 0.0)
            val rideTwo = Ride(1.0, 1.0)
            val rideThree  = Ride(0.0, 10.0)
            InvoiceGenerator().calculateTotalFair(listOf(rideOne, rideTwo, rideThree)) shouldBeExactly  21.0
        }

        "total for 1kms and 11 mi̦nutes should be Rs.21" {
            val rideOne = Ride(0.0, 10.0)
            val rideTwo = Ride(1.0, 1.0)
            InvoiceGenerator().calculateTotalFair(listOf(rideOne, rideTwo)) shouldBeExactly  21.0
        }

        "total for 1.32kms and 33 mi̦nutes should be Rs.46.2" {
            val rideOne = Ride(0.32, 10.0)
            val rideTwo = Ride(1.0, 23.0)
            InvoiceGenerator().calculateTotalFair(listOf(rideOne, rideTwo)) shouldBeExactly  46.2
        }

        "No ride at all" {
            InvoiceGenerator().calculateTotalFair(listOf()) shouldBeExactly 0.0
        }

    }
}
