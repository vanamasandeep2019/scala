
//Accesing a character in String
object CharDemo {
  
  def main(args: Array[String]): Unit = {
    
    var str="hello scala";
    
    //Method1:str(3)
    println(str(0));
    println(str(6));
    
    //Method2
    println(str.charAt(1));
    println(str.charAt(2));
    
    
    //Method3
    println(str.apply(9));
    
  }
  
}