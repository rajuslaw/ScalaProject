package session1
import scala.collection.immutable._
object _1_Using_scala extends App{
  val numbers= Seq(1,2,3)
  val double=for(n<-numbers) yield{
    if(n%2==0) {
      n * 2
    }else{
      n*3
    }
    }
  println(numbers)
}
