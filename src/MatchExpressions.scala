// Match Expressions in scala

//1) select between list of alternatives
// 2) Similar to multiple if statments
// 3) similar to switch statments in java



object MatchExpressions {
  
  def main(args: Array[String]): Unit = {
    
    var num=1;
    
    num match{
      case 1 => println("Iam first");
      case 2 => println("Iam second");
      case 3 => println("Iam third");
      case _ => println("Default");
      
    }
    
    var color="Red";
    
    color match{
      case "Red" => println("Iam Red");
      case "Green" => println("Iam Green");
      case "Blue" => println("Iam Blue");
      case _ => println("Default");
      
    }
    
  }
  
  
}