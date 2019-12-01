
object ListDemo {
  
  def main(args: Array[String]): Unit = {
    
    //List
   // 1. List is immutable.
   // 2.List is recursive and it represents a linked list
    
    var l=List(1,2,3);
    println(l);
    
    var l1:List[String]=List("a","b","c");
    println(l1);
    
    //By using cons operator (::)
    
    val a =1::(2::(3::Nil))
    println(a);
    
    //head
    println("First element in the list",a.head);
    println("First element in the list",l1.head);
    
    //tail
    println("Tail elements of the list",a.tail);
     println("Tail elements of the list",l1.tail);
     
     println("check whether list is empty or not",a.isEmpty);
     
     //Concatenating Lists ->3 ways 
  //   a) ::: Operator
  //   b) List.:::() method
   //  c) List.concat() method
     
     val l3=l:::l1;
     println(l3);
     
     val l4=l.:::(l1);
     println(l4);
     
     val l5=List.concat(l,l1);
    println(l5);
    
    // Creating uniform lists in scala
    
    val f=List.fill(7)(1);
    println(f);
    
    //Reverse a List
    val rev=l.reverse;
    println(rev);
    
    // Apply-Get the element by Index in scala list
    
    val x=l.apply(0);
    println("Get the element by index"+x);
    
    // contains-check whether element exists in the list or not
    println(l.contains(10));
    
    //length of the list by using length
    println("length of the list=",l.length);
    
    var list=List(1,1,1,2,3,3,2,4);
   println( list.distinct);
    
    
  }
  
}