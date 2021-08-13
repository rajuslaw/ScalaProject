package PracticeAssignment2

object _4_Tuple_Example extends App {
  var tuple1 = ("T-Shirts", "Medium", 10.99)
  var tuple2 = ("Polo-Shirt", "Large", 4.99)
  var tuple3 = ("Vest", "Small", 5.99)
  var tuple4 = ("T-Shirt", "Small", 4.99)

  var list = List(tuple1, tuple2, tuple3, tuple4)
  for (tuple <- list){
    println(tuple._1.toUpperCase()+" is priced at "+tuple._3+" for the "+tuple._2+" size")
  }
}