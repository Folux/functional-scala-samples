package language

object ExamplePatternMatching extends App{
  def getElement(index: Integer, list: List[String]): Option[String] = {
    if (index > list.length - 1) None
    else Some(list(index))
  }
  
  val shortList = List("A", "B", "C")
  val tenthElementOpt = getElement(9, shortList)

  tenthElementOpt match {
    case Some(element) => println(s"The 10th element is $element")
    case None => println(s"There is no 10th")
  }
  // prints: There is no 10th
}
