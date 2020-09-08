import scala.math.BigDecimal;
import scala.math.sqrt;
object Main extends App {
  val primes = Seq(2)
  val N = BigInt(600851475143L)
  println(largestPF(N))

  def isPrime(n: BigInt) : Boolean = {
    val m = sqt(n).toBigInt
    var factorFound = false
    for( i <- 2 to m.toInt){
      if(n%i==0){
        factorFound=true
      }
    }
   !factorFound
  }

  def smallestPF(n:BigInt):BigInt={
    val m = sqt(n).toBigInt
    for(i<-2 to m.toInt){
      if(n%i==0) return i
    }
    n
  }

  /*def largestFact(n:BigInt): BigInt={
    var largestFact = 1
    var i = 2
    while(i<=n){
      if(isPrime(i) && n%i==0) largestFact = i
      i=i+1
    }
    largestFact
  }*/

  def largestPF(n:BigInt): BigInt={
    if(isPrime(n)) n
    else largestPF(n/smallestPF(n))
  }



  def sqt(n:BigInt) :BigDecimal = { //taken from stack overflow
    val d = BigDecimal(n)
    var a = BigDecimal(1.0)
    var b = d
    while(b-a >= 0) {
      val mid = (a+b)/2
      if (mid*mid-d > 0) b = mid-0.0001  //adjust down
      else               a = mid+0.0001  //adjust up
    }
    b
  }
}