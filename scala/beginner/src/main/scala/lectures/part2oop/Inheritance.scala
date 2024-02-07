package com.fidev.training
package lectures.part2oop

object Inheritance extends App {

  // single class inheritance
  sealed class Animal { // seal - only extends class in this file
    final def up = println("Up!") // final prevent override
    val creatureType = "wild"
    protected def eat = println("namnam") // private
  }

  class Cat extends Animal {
    def crunch = {
      eat
      println("crunch crunch!")
    }
  }

  val cat = new Cat
  cat.crunch


  // constructors
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }
  class Adult (name: String, age: Int, idCard: String) extends Person(name)

  // override
  class Dog(override val creatureType: String) extends Animal {
    // override val creatureType = "domestic"
    override def eat: Unit = {
      super.eat
      println("crunch crunch")
    }
  }
  val dog = new Dog("K9")
  dog.eat
  println(dog.creatureType)


  // type substitution (broad: polymorphism)
  val unknownAnimal: Animal = new Dog("K9")

  // overRIDING vs overLOADING

  // super

  // preventing overrides
  // 1 - use final on member
  // 2 - use final on the entire class (prevent extends class)
  // 3 - seal the class - extends classes in THIS FILE, prevent extensions in other files

}
