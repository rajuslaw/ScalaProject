package PracticeAssignment2

object _5_Case_Exm extends App{
  case class Item(name: String, price: Double, quantity: Int)


  val item1 = Item("vanilla",2.99, 10)
  val item2 = Item("chocolate", 3.99, 3)
  val item3 = Item("cupcake", 4.99, 5)
  val list: List[Item]= List(item1,item2,item3)
 for (item<-list) println(item.quantity+" "+item.name+" at "+item.price + " each")
}