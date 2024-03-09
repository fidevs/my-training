package com.fidev.training
package lectures.part2oop

import playground.{PrinceCharming, Cinderella as Princess}

import java.util.Date
import java.sql.{Date => SqlDate}

object PackagingAndImports extends App {

  // package members are accessible by their simple name
  val writer = new Writer("Omar", "RockTheJVM", 2020) // (part2oop.OOBasics)

  // import the package
  val princess = new Princess // playground.Cinderella = fully qualified name

  // packages are in hierarchy
  // matching folder structure.

  // package object
  sayHello
  println(SPEED_OF_LIGHT)

  // imports

  val prince = PrinceCharming()

  val date = new Date

  // 1. use FQ names
  //  val sqlDate = new java.sql.Date()

  // 2. use aliasing
  val sqlDate = new SqlDate(2020, 10, 1)

  // default imports
  // java.lang - String, Object, Exception
  // scala - Int, Nothing, Function
  // scala.Predef println ???

}
