package language

object ExampleOption extends App {
  case class Person(name: String, surname: String)

  val chancellors: List[Person] = List(
    Person("Angela", "Merkel"),
    Person("Olaf", "Scholz"),
    null
  )
  
  val text =
    chancellors
      .map(_.name) // Throws NullPointer Exception
      .mkString(" follows ")

  println(text)
  
  val chacellorOptList: List[Option[Person]] = List(
    Some(Person("Angela", "Merkel")),
    Some(Person("Olaf", "Scholz")),
    None
  )

  val text2 =
    chacellorOptList.map(personOpt =>
        personOpt.map(person => person.name)
          .getOrElse("<unknown>")
      )
      .mkString(" follows ")

  println(text2)
  // prints: Angela follows Olaf follows <unknown>
}
