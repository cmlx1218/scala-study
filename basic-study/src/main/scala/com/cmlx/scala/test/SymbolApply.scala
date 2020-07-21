package com.cmlx.scala.test

/**
  * @Desc <- -> => 在scala中的运用
  * @Author cmlx
  * @Date 2020-7-21 0021 14:50
  */
object SymbolApply {

  def main(args: Array[String]): Unit = {
    //    ForAndMapSymbol
    /**
      * 1、表示函数的返回类型（Function Type）
      */
    FunctionType(double _)
    FunctionTypeMulti(add _)

    /**
      * 2、匿名函数
      */
    val sub = (x: Int, y: Int) => x - y
    println("=> 应用----匿名函数案例结果：" + sub(5, 3))

    /**
      * 3、case语句
      */
    val x: Int = 20
    val y: Int = 30
    val z: Int = 0
    x > y match {
      case false => println("=> 应用----case语句案例结果：" + y)
      case true => println("=> 应用----case语句案例结果：" + x)
    }

    /**
      * By-Name Parameters 传名参数
      * 传名参数在调用前表达式不会被求值，而是被包裹成一个匿名函数作为函数参数传递下去
      *
      */
    def double1(x: => Int) = x * 2

    def f(x: Int): Int = x

    double1(f(x))

  }

  def add(x: Int, y: Int): Int = x + y

  private def FunctionTypeMulti(add: (Int, Int) => Int) = {
    val x: (Int, Int) => Int = add
    println("=> 应用----函数返回类型多参数案例结果：" + x(1, 3))
  }

  def double(x: Int): Int = x * 2

  private def FunctionType(double: Int => Int) = {
    var x: (Int) => Int = double
    println("=> 应用----函数返回类型【=> 左边是输入类型，右边是返回类型】单参数案例结果：" + x(2))
  }

  private def ForAndMapSymbol = {
    /**
      * <- 只用在for循环中
      */
    for (i <- 1 to 100)
      println("爱你第" + i + "天！！！")

    /**
      * -> 只用在 key->value中
      */
    val map = Map("cmlx" -> 12, "zq" -> 18, "tt" -> 20, "zzr" -> "34")
    for (m <- map) {
      println(m._1 + "的年龄是：" + m._2)
      if (m._1.equals("zq"))
        println("希望你永远开心，祝福你，" + m._2)

    }
  }
}
