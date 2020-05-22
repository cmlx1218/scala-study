package com.cmlx.scala.test

/**
  * @Desc 只要以看到 object TestScala，就应该知道：
  *       1、object对应的是一个 TestScala$ 的静态对象 MODULE$
  *       2、在我们的程序中是一个单例
  * @Author cmlx
  * @Date 2020-5-21 0021 17:34
  */
object TestScala {

  def main(args: Array[String]): Unit = {
    //println("Hello,This is my Scala Program!")
    //println(sayHello)
    var num:Int=1
    num <<= 3
    println(num)
  }

  /**
    * 开发中，我们有一个方法，会异常中断，就可以返回Nothing
    * 当我们用Nothing 做返回值，就明确说明该方法没有正常返回值
    *
    * @return
    */
  def sayHello: Nothing = {
    throw new Exception("你错了傻逼")
  }

}
