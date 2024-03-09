package com.fidev.training
package lectures.part3fp

object WhatsAFunction extends App {

  // DREAM: use functions as first class elements
  // problem: OOP

  val doubler = new MyFunction[Int, Int] {
    override def apply(element: Int): Int = element * 2
  }

  println(doubler(3))

  // function types = Function[A, B]
  val stringToIntConverter = new Function1[String, Int] {
    override def apply(str: String): Int = str.toInt
  }

  println(stringToIntConverter("5") + 3)

  val adder: ((Int, Int) => Int) = new Function2[Int, Int, Int] {
    override def apply(v1: Int, v2: Int): Int = v1 + v2
  }

  // Function types Function2[A, B, R] == ()

  // ALL SCALA FUNCTIONS ARE OBJECTS

  val concatenator: ((String, String) => String) = new Function2[String, String, String] {
    override def apply(str1: String, str2: String): String = str1 + str2
  }
  println(concatenator("Hola ", "Mundo"))

  // Function[Int, Function[Int, Int]]
  val superAdder: Int => Int => Int = new Function1[Int, Int => Int] {
    override def apply(x: Int): Int => Int = new Function1[Int, Int] {
      override def apply(y: Int): Int = x + y
    }
  }

  val adder3 = superAdder(4)
  println(adder3(3))
  println(superAdder(4)(3)) // curried functions

  trait MyFunction[A, B] {
    def apply(element: A): B
  }

}
