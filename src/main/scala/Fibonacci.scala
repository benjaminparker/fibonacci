object Fibonacci {
  def forPosition(i: Int) : Int = {
    if (i == 0 || i == 1) i else {
      forPosition(i - 2) + forPosition(i - 1)
    }
  }
}
