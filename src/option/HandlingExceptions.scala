package option

object HandlingExceptions extends App {
  def getElement(index: Integer, list: List[String]): String = {
    list(index)
  }

  val shortList = List("A", "B", "C")
  
  val tenthElement = getElement(9, shortList)
  println(s"The 10th element is $tenthElement")
  // Throws IndexOutOfBoundsException

  def getElementSavley(index: Integer, list: List[String]): Option[String] = {
    if (index > list.length - 1) None
    else Some(list(index))
  }
  
  val tenthElementOpt = getElementSavley(9, shortList)
  println(s"The 10th element is ${tenthElementOpt.getOrElse("not there")}")
  // prints: The 10th element is not there
}
