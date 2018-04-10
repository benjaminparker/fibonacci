import org.specs2.mutable.Specification

class FibonacciTest extends Specification {

  "Fibonacci (0,1,1,2,3,5,8,13)" should {

    "return 0 for index = 0" in {
      Fibonacci.forIndex(0) mustEqual 0
    }

    "return 1 for index = 1" in {
      Fibonacci.forIndex(1) mustEqual 1
    }

    "return 1 for index = 2" in {
      Fibonacci.forIndex(2) mustEqual 1
    }

    "return 2 for index = 3" in {
      Fibonacci.forIndex(3) mustEqual 2
    }

    "return sum of previous two fibonacci numbers" in {
      (4 to 20).map { i =>
        Fibonacci.forIndex(i) mustEqual Fibonacci.forIndex(i - 2) + Fibonacci.forIndex(i - 1)
      }
    }
  }
}
