import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.doubles.shouldBeExactly

class InvoiceGeneratorTest : StringSpec() {
    init {

        "total for 0 kms and 0 mi̦nutes should be Rs.0" {
            InvoiceGenerator().calculateFair(0.0,0.0) shouldBeExactly  0.0
        }

        "total for 1 kms and 1 minutes should be Rs.11" {
            InvoiceGenerator().calculateFair(1.0,1.0) shouldBeExactly  11.0
        }

        "total for 0 kms and 10 minutes should be Rs.10" {
            InvoiceGenerator().calculateFair(0.0,10.0) shouldBeExactly  10.0
        }
    }
}
