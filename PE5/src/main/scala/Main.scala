
import scala.math.BigInt
object Main extends App{
  var found = false
  var i = 20
  var s = Seq[BigInt](1)

  for(i<-1 to 20) s=s:+i

  println(lcmS(s))

  def gcd(a: BigInt, b:BigInt):BigInt ={
    var largestDiv=1
    for(i <-1 to a.min(b).toInt) if(a%i==0 && b%i==0) largestDiv=i
    largestDiv
  }

  def lcm(a:BigInt, b:BigInt): BigInt ={
    a*b/gcd(a,b)
  }
  def lcmS(s: Seq[BigInt]): BigInt ={
    if(s.length==2) lcm(s.head, s(1))
    else lcm(s.head, lcmS(s.tail))
  }

  def gcdS(s: Seq[BigInt]): BigInt={
   if(s.length==2) gcd(s.head, s(1))
   else gcd(s.head, gcdS(s.tail))
  }
}



