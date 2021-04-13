package com.test.scala

object Object_Apply {
  def apply(num: Int): Unit = {
    println("Score is " + num)
  }

  def main(args: Array[String]): Unit = {
    Object_Apply(50)

    val r = 1 to 10
    val rl=1 until 10
    println(r)
    println(rl)
  }
}
