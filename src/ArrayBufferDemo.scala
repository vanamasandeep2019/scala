
//ArrayBuffer

//1.Array is mutable.The elements in the array can change but the size can't be changed.

import scala.collection.mutable.ArrayBuffer;
object ArrayBufferDemo {
  
  def main(args: Array[String]): Unit = {
    
    var ab=ArrayBuffer[String]();
    ab+="Red";
    ab+="Green";
    ab+="Blue";
    
    ab+="Orange";
     ab+=("black","white");
      ab.append("pink","skyblue");
      ab.remove(0);
      ab-="pink";
      ab--=Array("black","white");
      ab.clear();
      ab.foreach(println);
      
    
  }
  
}