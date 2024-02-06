package com.fidev.training
package lectures.part2oop

object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String) {
    def likes(movie: String): Boolean = this.favoriteMovie == movie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = s"$name, what the heck?!"
    def isAlive: Boolean = true
    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // equivalent
  // infix notation = operator notation (syntactic sugar)

  // "operators" in Scala
  val tom = new Person("Tom", "Fight Club")
  println(mary + tom)
  println(mary.+(tom))

  println(1 + 2)
  println(1.+(2))

  // ALL OPERATORS ARE METHODS
  // Akka actors have ! ?


  // prefix notation
  val x = -1 // equivalent with 1.unary_-
  val y = 1.unary_- // only works with - + ~ !

  println(tom.unary_!)
  println(!tom)

  // postfix notation
  println(mary.isAlive)
  // println(mary isAlive) not works for me :'(

  // apply
  println(mary.apply())
  println(mary()) // equivalent
}
