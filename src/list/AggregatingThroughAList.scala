package list

object AggregatingThroughAList extends App {
  val names = List("Olaf", "Angela", "Gerhard", "Helmut")

  // non-functional approach
  // -------------------------------------
  var totalLength = 0

  for (i <- 0 until names.size) {
    totalLength += names(i).length
  }
  
  println(s"Total length is $totalLength")
  // prints: Total lenth is 23

  
  // functional approach
  // -------------------------------------
  val totalLengthFun = names.foldLeft(0)(_ + _.length)
  
  println(s"Total length is $totalLengthFun")
  // prints: Total lenth is 23

}
