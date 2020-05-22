package com.cmlx.scala.test

/**
  * @Desc 只要以看到 object TestScala，就应该知道：
  *      1、object对应的是一个 TestScala$ 的静态对象 MODULE$
  *      2、在我们的程序中是一个单例
  * @Author cmlx
  * @Date 2020-5-21 0021 17:34
  */
object TestScala {

  def main(args: Array[String]): Unit = {
    println("Hello,This is my Scala Program!")
  }

}
