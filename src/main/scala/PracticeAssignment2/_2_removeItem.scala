package PracticeAssignment2

import scala.collection.mutable.ArrayBuffer

object _2_removeItem extends App{
  var basket = ArrayBuffer("Milk","Cheese","Donuts","Apples","Bananas")
  var fruitBasket= ArrayBuffer("Apples","Bananas","Mango")
  var result=(basket--=fruitBasket)

  print(result.mkString("|"))
}
