package com.cmlx.scala.test

/**
  * @Desc 循环练习
  * @Author cmlx
  * @Date 2020-5-22 0022 12:27
  */
object ForDemo {

  def main(args: Array[String]): Unit = {
    scopeDataCyclic();
    forUntil();
    forVar();
    yieldFor();
    forBuchang();
    forBuchang001();

  }

  //范围数据循环
  def scopeDataCyclic() {
    for (i <- 1 to 20) {
      println("爱你一万年")
    }
  }

  def forBuchang() {
    for (i <- Range(1,20,5)) {
      println("爱你一万年"+i)
    }
  }

  def forBuchang001() {
    for (i <- 1 to 20 if i % 5 == 1) {
      println("爱你一万年"+i)
    }
  }


  def forUntil() {
    for (i <- 1 until 10) {
      println("until" + i)
    }
  }

  def forVar(): Unit = {
    for (i <- 1 to 4; j = i + 100) {
      println("j=" + j)
    }
  }

  def yieldFor(): Unit = {
    // yield i 将每次循环得到的 i 放到Vector中，并返回给res
    // i 在这里表示的是一个代码块，意味着我们可以对 i 进行逻辑处理
    // 体现出scala 的语法特点，将一个集合中多个数据进行处理，并返回给新的集合
    var res = for (i <- 1 to 20) yield {
      if (i % 2 == 0) {
        i
      } else {
        i + "不是偶数"
      }
    }
    println(res)
  }


}
