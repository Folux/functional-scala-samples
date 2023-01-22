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
  val addLengthFunction: (Int, String) => Int = {
    (length, name) => length + name.length
  }

  println("Total length is " +
    names.foldLeft(0)(addLengthFunction)
  )
  // prints: Total lenth is 23

  // or the short syntax
  println("Total length is " +
    names.foldLeft(0)(_ + _.length)
  )
  // prints: Total lenth is 23

}
