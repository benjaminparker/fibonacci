import scala.annotation.tailrec

object Fibonacci {
  def forIndex(index: Int) : Int = {
    @tailrec
    def fib(index: Int, a: Int, b: Int): Int = index match {
      case 0 => a
      case _ => fib(index - 1, b, a + b)
    }

    fib(index, 0, 1)
  }
}
