package com.cmlx.scala.function

/**
  * @Desc
  * @Author cmlx
  * @Date 2020-5-25 0025 15:24
  */
object MethodToFunction {


  def main(args: Array[String]): Unit = {

    val sum = new Sum
    println(sum.sum(10, 20))

    // 方法转函数
    val f = sum.sum _
    println(f + "")
    println(f(10, 20) + "")

    println(f1(20, 30))


  }

  // 函数，求两个数的和
  val f1 = (n1: Int, n2: Int) => {
    n1 + n2
  }

  class Sum {
    def sum(n1: Int, n2: Int): Int = {
      n1 + n2
    }
  }


}
