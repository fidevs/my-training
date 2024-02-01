package com.fidev.training
package lectures.part1basics

object ValuesVariablesTypes extends App {

  // val ARE IMMUTABLE
  val x: Int = 42
  println(x)

  // Compiler can infer types
  val aString: String = "hello"
  val bString = "goodbye"


  // Value types
  val aBoolean: Boolean = true
  val aChar: Char = 'a'
  val aInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 654843215494984546L
  val aDouble: Double = 3.14
  val aFloat: Float = 3.14f


  // variables -> used for side effects on functional programming
  var aVariable: Int = 5
  aVariable = 8

}
