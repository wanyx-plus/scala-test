package com.test.scala

/**
 * Scala:
 *  1. Scala object 相当与java中的单例，object中定义的全是静态的，相当于java中的工具类
 *     2.Scala中定义变量使用var，定义常量使用val，变量可变，常量不可变。变量和常量类型可以省略不写，会自动推断参数类型。
 *     3.Scala中每行后面都会有分号推断机制，不用显式写“：”。
 *     4.Scala类中可以传参，传参要指定类型，有了参数就有了默认的构造。类中的属性默认有getter，setter方法
 *     5.类中重写构造时，构造第一行必须先调用默认的构造
 *     6.Scala中 当new class时，类中除了方法不执行，其他都执行 (因此可能在类中其他位置给类中属性赋值)
 *     7.在同一个Scala文件中，class名称和Object名称一样时，这个类叫做这个对象的伴生对象，他们之间可以互相访问私有变量
 */
object Leson_ClassAndObje {
  val name = "wangwu"

  def main(args: Array[String]): Unit = {
//    val p = new Person("zhangsan", 30)
    val p = new Person("zhangsan", 30,'F')
    println(p.name)
    println(p.age)
    p.seyHello()
  }
}

class Person(xname: String, xage: Int) {
  val name = xname
  val age = xage
  var gender = 'M'

  println("************")

  // 重写构造方法
  def this(yname: String, yage: Int, ygender: Char) {
    this(yname, yage)
    this.gender = ygender
    println("三个参数的构造")
  }

  println("++++++++++++++")

  // 定义方法
  def seyHello(): Unit = {
    println("普通方法")
    println("hello " + Leson_ClassAndObje.name)
  }
}
