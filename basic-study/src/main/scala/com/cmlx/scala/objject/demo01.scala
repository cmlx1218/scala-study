package com.cmlx.scala.objject

/**
  * @Desc
  * @Author cmlx
  * @Date 2020-5-27 0027 15:25
  */
object demo01 {

  def main(args: Array[String]): Unit = {

    val student = new Student
    student.address = "成都"
    println(student.address)
    student.toStrings()

  }


  class Student {

    var name: String = _
    var age: Int = _
    var address: String = _

    def toStrings(){
      println(this.address + "---" + this.age + "---" + this.name)
    }

  }


}
