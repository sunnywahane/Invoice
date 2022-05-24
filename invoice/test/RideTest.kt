import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.doubles.shouldBeExactly

class RideTest : StringSpec() {
    init {
        "Calculate fair for a single Ride that was cancelled" {
            val ride = Ride(0.0, 0.0)
            ride.calculateFair() shouldBeExactly 0.0
        }

        "Calculate fair for a single Ride with no distance covered but taxi waited for 20 minutes" {
            val ride = Ride(0.0, 20.0)
            ride.calculateFair() shouldBeExactly 20.0
        }

        "Calculate fair for a single ride of 1 kms and took 5 minutes" {
            val ride = Ride(1.0, 5.0)
            ride.calculateFair() shouldBeExactly 15.0
        }
    }
}
