

object forLoopDemo {
  
  def main(args: Array[String]): Unit = {
    
   /* for (i <- 0 to 10){
      println(i);
    }*/
     /*for (i <- 0 until 10){
      println(i);
    }*/
    
   /* for( x<- 0 to 5 ; y<- 5 to 10){
      println("value of x="+x);
       println("value of y="+y);
    }*/
     
   /*  val list=List(1,2,3,4,5,6,7,8,9,10);
     for( l <- list ;if l>3)
     {
       println(l);
     }*/
    
    var arr=Array(1,2,3,4,5);
    for( a <- arr){
      println(a);
    }
    
    
    
    
  }
  
}