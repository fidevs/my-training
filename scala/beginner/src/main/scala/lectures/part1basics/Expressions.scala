package com.fidev.training
package lectures.part1basics

object Expressions extends App {

  // Expressions are evaluated to get a value

  // (1 + 2) are a expression
  val x = 1 + 2
  println(x)

  println(2 + 3 * 4)

  println(x == 1) // == != > >= < <=

  println(!(x == 1)) // ! && ||


  // SIDE EFFECTS - change a variable
  var aVariable = 3
  aVariable += 2 // -= *= /=
  println(aVariable)


  // Instructions (DO) vs Expressions (VALUE)

  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 8 else 5
  println(aConditionedValue)


  // EVERYTHING, in Scala is an Expression!
  var i = 0
  while (i < 5) {
    println(i)
    i += 1
  }
  // NEVER WRITE THIS AGAIN.

  val aWeirdValue = (aVariable = 1) // Unit == void
  println(aWeirdValue)


  // CODE BLOCKS
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "Hello" else "goodbye" // Result of this is the value of the code-block
  }

}
