package com.cmlx.scala.test

/**
  * @Desc 循环练习
  * @Author cmlx
  * @Date 2020-5-22 0022 12:27
  */
object CyclicDemo {

  def main(args: Array[String]): Unit = {
    scopeDataCyclic();
  }

  //范围数据循环
  def scopeDataCyclic(){
    for (i <- 1 to 100){
      println("爱你一万年")
    }
  }


}
