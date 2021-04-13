package com.test.scala

object Simple_Grammar {
  def main(args: Array[String]): Unit = {
    /*  // if ... else ....
      val age = 20
      if (age < 20) {
        //do something
      } else if (age <= 30) {
        // do something
      } else {
        // do something
      }*/

    // to 包含末尾元素 相当于 <=
    /* for (i <- 1 to (10)) {
       println(i)
     }*/

    // until 不包含末尾元素 相当于 <
    /* for (i <- 1.until(10)) {
       for (j <- 1.until(10)) {
         if (i >= j) {
           print(i + "*" + j + "=" + i * j + "\t")
         }
         if (i == j) {
           println()
         }
       }
     }*/

    // 双层for循环可简化
    /* for (i <- 1.until(10); j <- 1.until(10)) {
       if (i >= j) {
         print(i + "*" + j + "=" + i * j + "\t")
       }
       if (i == j) {
         println()
       }
     }*/

    /*for (i <- 1.to(20) if (i > 10) if (i % 2 == 0)) {
      println(i)
    }*/

    // 使用 yield 关键字返回的是一个满足条件的集合
    /*val result = for (i <- 1.to(20) if (i > 10) if (i % 2 == 0)) yield i
    println(result)*/

    // while 循环
    var i = 0
    while (i < 10) {
      println(s"第 ${i} 次循环")
      i += 1
    }

  }
}
