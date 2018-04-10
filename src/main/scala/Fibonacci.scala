object Fibonacci {
  def forPosition(i: Int) : Int = i match {
    case 0 | 1 =>  i
    case _ => forPosition(i - 2) + forPosition(i - 1)
  }
}
