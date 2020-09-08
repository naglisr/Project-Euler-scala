object Main extends App{
  var largestProd = 0
  for(i <- 100 to 999){
    for(j <- i to 999){
      val n = i*j
      val s = n.toString
      if(s==s.reverse && n> largestProd) largestProd = n
    }
  }
  println(largestProd)
}