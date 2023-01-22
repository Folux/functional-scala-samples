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
  println("Found the name: " +
    names.exists(name => name == "Angela")
  )
  // prints: Found the name: true
}
