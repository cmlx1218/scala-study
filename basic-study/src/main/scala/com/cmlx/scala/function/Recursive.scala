package com.cmlx.scala.function

/**
  * @Desc
  * @Author cmlx
  * @Date 2020-5-25 0025 17:24
  */
object Recursive {

  def main(args: Array[String]): Unit = {
    //    test(4)
    //    test01(4)
    println("fbn的结果是：" + fbn(4))
  }


  def test(t: Int) {
    if (t > 2) {
      test(t - 1)
    }
    println("t=" + t)
  }

  def test01(t: Int) {
    if (t > 2) {
      test01(t - 1)
    } else {
      println("t=" + t)
    }
  }

  def fbn(n: Int): Int = {
    if (n == 1 || n == 2) {
      1
    } else {
      fbn(n - 1) + fbn(n - 2)
    }
  }

}
