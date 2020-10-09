object Main extends App{
  for(a <- 1 to 500){
    for(b <- 1 to 500){
      for(c <- 1 to 500){
        if(a+b+c==1000&& a*a+b*b==c*c) println(a*b*c)
      }
    }
  }
}