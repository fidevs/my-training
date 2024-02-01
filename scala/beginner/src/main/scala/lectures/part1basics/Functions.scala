package com.fidev.training
package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 3))

  def aParameterLessFunction: Int = 32
  println(aParameterLessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }
  println(aRepeatedFunction("hello", 3))
  // WHEN YOU NEED LOOPS, USE RECURSION.

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n-1)
  }

  def greeting(name: String, age: Int): String = {
    "Hi my name is " + name + " and I am " + age + " years old"
  }
  println(greeting("Omar", 20))

  def factorial(n: Int, limit: Int): Int = {
    if (n == limit) n
    else n * factorial(n+1, limit)
  }
  println(factorial(1, 5))

  def fibonacci():Unit = ()

  def isOdd(number: Int): Boolean = !(number % 2 == 0)
  println(isOdd(3))

}
