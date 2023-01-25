package language

object ExampleOption extends App {
  case class Person(name: String, surname: String)

  val chancellors: List[Person] = List(
    Person("Angela", "Merkel"),
    Person("Olaf", "Scholz"),
    null
  )
  
  val chacellorOptList: List[Option[Person]] = List(
    Some(Person("Angela", "Merkel")),
    Some(Person("Olaf", "Scholz")),
    None
  )

  val text =
    chacellorOptList.map(personOpt =>
        personOpt.map(person => person.name)
          .getOrElse("<unknown>")
      )
      .mkString(" follows ")

  println(text)
  // prints: Angela follows Olaf follows <unknown>
}
