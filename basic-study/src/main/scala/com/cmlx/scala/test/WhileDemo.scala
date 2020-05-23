package com.cmlx.scala.test

object WhileDemo {


  def main(args: Array[String]): Unit = {
    whileDemo();
    doWhileDemo();
    multiCycle();
  }

  def whileDemo(): Unit = {
    var i = 0;
    while (i < 100) {
      i += 10
      println(i)
    }
  }

  def doWhileDemo(): Unit = {
    var i = 0;
    do {
      i += 10
      println(i)
    } while (i < 100)
  }

  def multiCycle(): Unit = {
    for (i <- 1 to 9) {
      for (j <- 1 to i) {
        if (i >= j) {
          print(j + "*" + i + "=" + i * j + "\t")
        }
      }
      println()
    }
  }

}
