import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.doubles.shouldBeExactly

class InvoiceGeneratorTest : StringSpec() {
    init {

        "total for 0 kms and 0 mi̦nutes should be Rs.0" {
            val rideOne = Ride(0.0, 0.0)
            InvoiceGenerator().calculateFair(listOf<Ride>(rideOne)) shouldBeExactly 0.0
        }

        "total for 1 kms and 21 mi̦nutes should be Rs.21" {
            val rideOne = Ride(0.0, 0.0)
            val rideTwo = Ride(1.0, 1.0)
            val rideThree  = Ride(0.0, 10.0)
            InvoiceGenerator().calculateFair(listOf(rideOne, rideTwo, rideThree)) shouldBeExactly  21.0
        }
    }
}
