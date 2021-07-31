package session1
import scala.collection.immutable._
object _1_OddNumber_scala extends App {
  val numbers = Seq(2, 4, 6, 7, 10, 3);
  var count:Int=0
  for (i <-numbers){
    if(i%2!=0){
      count=count+i
    }
  }
  print(count)
}
