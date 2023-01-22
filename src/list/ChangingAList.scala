package list

import scala.collection.mutable

object ChangingAList extends App {
  // non-functional approach
  // -------------------------------------
  val numbersMutable =
  mutable.ArrayBuffer(1, 2, 3, 4)

  for (i <- 0 until numbersMutable.size) {
    numbersMutable(i) += 10
  }
  println(numbersMutable)
  // prints: ArrayBuffer(11, 12, 13, 14)

  // functional approach
  // -------------------------------------
  val numbersImmutable = List(1, 2, 3, 4)

  println(
    numbersImmutable.map(number => number + 10)
  )
  // prints: List(11, 12, 13, 14)
}
