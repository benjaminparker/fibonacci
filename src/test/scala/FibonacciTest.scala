import org.specs2.mutable.Specification

class FibonacciTest extends Specification {

  "Fibonacci (0,1,1,2,3,5,8,13)" should {

    "return 0 for position = 0" in {
      Fibonacci.forPosition(0) mustEqual 0
    }

    "return 1 for position = 1" in {
      Fibonacci.forPosition(1) mustEqual 1
    }

    "return 1 for position = 2" in {
      Fibonacci.forPosition(2) mustEqual 1
    }

    "return 2 for position = 3" in {
      Fibonacci.forPosition(3) mustEqual 2
    }

    "return 8 for position = 6" in {
      Fibonacci.forPosition(6) mustEqual 8
    }

    "return sum of previous two positions" in {
      (7 to 20).map { i =>
        Fibonacci.forPosition(i) mustEqual Fibonacci.forPosition(i - 2) + Fibonacci.forPosition(i - 1)
      }
    }
  }
}
