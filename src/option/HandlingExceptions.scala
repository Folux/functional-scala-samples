package option

object HandlingExceptions extends App {
  def getElement(index: Integer, list: List[String]): String = {
    list(index)
  }

  val shortList = List("A", "B", "C")
  println(s"The 10th element is ${getElement(9, shortList)}")
  // Throws IndexOutOfBoundsException

  def getElementSavley(index: Integer, list: List[String]): Option[String] = {
    if (index > list.length - 1) None
    else Some(list(index))
  }
  println("The 10th element is " +
    getElementSavley(9, shortList).getOrElse("not there"))
  // prints: The 10th element is not there
}
