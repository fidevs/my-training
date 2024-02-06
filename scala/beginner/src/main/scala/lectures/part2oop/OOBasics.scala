package com.fidev.training
package lectures.part2oop

object OOBasics extends App {

  val person = new Person("Omar", 22)
  println(person.age)
  println(person.x)
  person.greet()
  person.greet("John")

  val author = new Writer("Omar", "Duarte", 1970)
  val impostor = new Writer("Omar", "Duarte", 1970)
  val novel = new Novel("Live", 2004, author)

  println(novel.authorAge())
  println(novel.isWrittenBy(author))
  println(novel.isWrittenBy(impostor))

  val counter = new Counter
  counter.inc.print
  counter.inc.inc.inc.print
  counter.inc(10).print
}


// class parameters are not FIELDS. We need to add the 'val' prefix
class Person(name: String, val age: Int = 0) { // constructor
  // body
  var x = 2

  println(1 + 3)

  // overloading
  def greet(): Unit = println(s"Hi, I am $name")
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  // multiple constructors
  def this(name: String) = this(name, 0)
  def this() = this("John")

}


// Novel and Writer

class Writer(name: String, surname: String, val year: Int) {
  def fullname(): String = s"$name $surname"
}

class Novel(name: String, var year: Int, author: Writer) {
  def authorAge(): Int = year - author.year

  def isWrittenBy(author: Writer): Boolean = this.author == author

  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}


// Counter
class Counter(val value: Int = 0) {
  def inc = {
    println("Incrementing")
    new Counter(value + 1)
  }
  def inc(value: Int): Counter = {
    if (value <= 0) this
    else inc.inc(value - 1)
  }
  def dec = new {
    println("Decrementing")
    Counter(value - 1)
  }
  def dec(value: Int): Counter = {
    if (value <= 0) this
    else inc.inc(value - 1)
  }
  def print = println(value)
}
