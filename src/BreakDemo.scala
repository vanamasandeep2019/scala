
import scala.util.control.Breaks._;
object BreakDemo {
  
  def main(args: Array[String]): Unit = {
    
    breakable{
      for(i <- 1 to 10)
      {
        println(i);
        if(i==4)
          break;
      }
    }
    println("Iam out of break statement");
    
    
    
  }
  
}