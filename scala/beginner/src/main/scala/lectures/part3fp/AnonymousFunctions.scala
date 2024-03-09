package com.fidev.training
package lectures.part3fp

object AnonymousFunctions extends App {

  // anonymous function (LAMBDA)
  val doubler: Int => Int = (x: Int) => x * 2

  // multiple params on lambda
  val adder: (Int, Int) => Int = (a: Int, b: Int) => a + b

  // no params
  val justDoSomething: () => Int = () => 3

  // careful
  println(justDoSomething) // function itself
  println(justDoSomething()) // function call

  // curly braces with lambdas
  val stringToInt = { (str: String) =>
    str.toInt
  }

  // MOAR syntactic sugar
  val niceIncrementer: Int => Int = _ + 1 // equivalent to (x: Int) => x + 1
  val niceAdder: (Int, Int) => Int = _ + _ // equivalent to (a: Int, b: Int) => a + b

  val superAdder: (Int) => Int => Int = (a: Int) => (b: Int) =>  a + b
  println(superAdder(3)(8))

}
