

object ArrayDemo {
  
  def main(args: Array[String]): Unit = {
    
     var arr:Array[String]=new Array[String](3);
     
     arr(0)="Sandeep";
     arr(1)="Krishna";
    // arr(2)="sam";
     
    for(x <- arr){
      println(x);
    }
    
    var arr1=Array("san","Krish");
    for(x<- arr1)
    {
       println(x);
    }
   
    
  }
  
}