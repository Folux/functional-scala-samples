package language

object ExampleHigerOrderFunction extends App {
  val myFunction: String => Boolean = {
    name =>
      if (name.length > 10) true
      else false
  }

  def checkNames(name: String, f: String => Boolean) = {
    if (f(name)) println("Your name is too long")
    else println("Your name is OK")
  }

  checkNames("AIDA", myFunction)
}
