package session1
import scala.io.StdIn.{readLine,readInt}
object _1_PatternMatch_scala {
  def main(args:Array[String]): Unit ={
    //read value from Stdin
    println("Enter the value")
    var input:Int=readInt();
    println(patternMatch(input))
    //Direct function call

    val x= patternMatch(3)
    println("This is Program Argument : "+x)
  }
  def patternMatch(x:Int):String=x match {
    case 1 | 8=>"Monday"
    case 2=>"Tuesday"
    case 3=>"Wednesday"
    case 4=>"Thursday"

  }
}
