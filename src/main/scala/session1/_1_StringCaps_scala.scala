package session1

object _1_StringCaps_scala extends App {
  val names = List("january", "march")
  val newNames=caps(names)
  println(newNames)
   def caps(strList:List[String]): List[String]={
      for (i<-strList) yield "HELLO " + i.toUpperCase()

   }
}
