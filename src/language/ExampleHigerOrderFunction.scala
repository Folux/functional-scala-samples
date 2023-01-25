package language

object ExampleHigerOrderFunction extends App {
  val isNameTooLongFunction: String => Boolean = {
    name =>
      if (name.length > 10) true
      else false
  }

  def checkNames(name: String, f: String => Boolean) = {
    if (f(name)) println("Your name is not good")
    else println("Your name is OK")
  }

  checkNames("AIDA", isNameTooLongFunction)
  // prints: Your name is OK
}
