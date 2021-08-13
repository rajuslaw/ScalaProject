package PracticeAssignment2

import scala.collection.mutable.ArrayBuffer
import scala.math.Ordered.orderingToOrdered

object _1_common_element extends App{
  var basket1= ArrayBuffer("Cake","Milk","Cheese","Toilet Paper")
  var basket2= ArrayBuffer("Bread","water","juice","Milk","Cheese")

 println( basket1.intersect(basket2))
}
