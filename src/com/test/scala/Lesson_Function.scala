package com.test.scala

object Lesson_Function {

  def main(args: Array[String]): Unit = {
    /**
     * 方法定义
     * 1.方法体中最后返回值可以使用return如果使用了return那么方法体的返回值类型一定要指定
     * 2.如果方法体中没有return，默认将方法体中最后一行计算的结果仿作返回值返回。方法体的返回值类型可以省略，会自动推断返回值类型
     * 3.定义方法传入的参数一定要指定类型
     * 4.方法的方法体如果可以一行写完，方法体的“{。。。}”可以省略
     * 5.如果定义方法时，省略了方法名称和方法体之间的 “=”，那么无论方法体最后一行计算的结果时什么，都会被忽略，返回一堆空括号
     *
     */
    /*def max(a: Int, b: Int): Int = {
      if (a > b) {
        return a
      }
      return b
    }*/
    // 简化max方法


    /**
     * 递归方法
     */
    /*def Recursion(num: Int): Int = {
      if (num == 1) 1 else num * Recursion(num - 1)
    }

    println(Recursion(5))*/

    /**
     * 参数有默认值的方法
     */
    def fun1(a: Int = 1, b: Int = 2) = {
      a + b
    }

    //    println(fun1())

    /**
     * 可变长参数方法
     */
    def fun2(s: String*) = {
      s.foreach(println(_))
    }

//    fun2("aaa","asedqw","aq","sawqw")








  }


}
