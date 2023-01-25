package list

object CheckingOccurrence extends App {
  val names = List("Olaf", "Angela", "Gerhard", "Helmut")

  // non-functional approach
  // -------------------------------------
  var foundName = false

  for (i <- 0 until names.length) {
    if (names(i) == "Angela") {
      foundName = true
    }
  }

  println("Found the name: " + foundName)
  // prints: Found the name: true


  // functional approach
  // -------------------------------------
  val foundNameFun = names.exists(name => name == "Angela")
  //                      .exists(_ == "Angela")
  println(s"Found the name: $foundNameFun")
  // prints: Found the name: true
}
