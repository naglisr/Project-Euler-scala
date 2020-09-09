object Main extends App{
  val s = (1 to 100).toSeq
  println(squareSum(s)-sumSquares(s))
  def sumSquares(s: Seq[Int]):Int={
    s.map(x => x*x).sum
  }

  def squareSum(s:Seq[Int]):Int={
    val x = s.sum
    x*x
  }
}
