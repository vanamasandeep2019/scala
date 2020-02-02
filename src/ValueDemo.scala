
// Val's are immutable and cannot be reassigned.
// var's are mutable and we cannot reassign values to var
// val and var have types.compiler will infer the values during compile time based
//on the values assigned to them.
object ValueDemo extends App {
  
  val x =20;
  println(x);
  
  val str="Hello World";
  println(str);
  
  val char='a';
  println("Printing character value="+char);
  
  val d=123.567
  println("Double Value= "+d);
  
  val f=12.345f
    println("floatValue= "+f);
  
  val l=1546723532464436L;
  println("Long value= "+l);
  
  var y=10;
  
  println("x value="+y)
}