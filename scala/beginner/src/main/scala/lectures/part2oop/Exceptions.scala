package com.fidev.training
package lectures.part2oop

object Exceptions extends App {

  val x: String = null
  // println(x.length)
  // this ||||| will crash with a NPE

  // 1. throwing exceptions

  val aWeirdValue: String = throw new NullPointerException // -> Nothing

  // throwable classes extend the Throwable class.
  // Exception and Error are the major Throwable subtypes


  // 2. how to catch exceptions
  def getInt(withException: Boolean): Int =
    if (withException) throw new RuntimeException("No int for you")
    else 42

  val potentialFail =  try { // -> AnyVal (depending on try and catch return)
    getInt(true)
  } catch {
    case e: RuntimeException => println("caught a Runtime exception")
    case e: NullPointerException => println("caught a NullPointer exception") // it not will be threw
  } finally {
    // optional, only use for inside effects
    println("finally")
  }

  println(potentialFail)


  // 3. 

}
