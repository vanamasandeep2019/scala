

object forLoopsDemo {
  
  def main(args: Array[String]): Unit = {
    
    val a=Array("Red","Green","Blue");
    
    for(e<-a)
      println(e)
      
      for(e<-a)
      {
        val s=e.toUpperCase()
        println(s);
      }
    
    val newArray=for(e<-a) yield e.toUpperCase();
     for(e<-newArray)
      println(e)
    
      for (i <- 0 until newArray.length)
      {
        println("Using Counters",newArray(i));
      }
     
     for(i<- 1 to 50)
       println("Printing values from 1 to 50 "+i);
      
      println("Printing Even numbers ");
     for(i<- 1 to 50 if(i%2==0))
     {
       println(i);
     }
     
      println("Printing Elements using for each ");
     newArray.foreach(println);
     
     newArray.foreach{
       e=> 
         val s=e.toUpperCase();
         println(s);
     }
      
  }
  
}