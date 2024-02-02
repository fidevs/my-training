package com.fidev.training
package lectures.part1basics

object DefaultArgs extends App {

  def trFact(n: Int, acc: Int = 1): Int =
    if (n <= 1) acc
    else trFact(n-1, n*acc)

  val trFact10 = trFact(10)

  def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = println("Saving picture")
  savePicture("bmp", 800, 600)
  savePicture()
  savePicture("bmp")
  savePicture(width = 50, height = 21, format = "png")

}
