# Scala基础
## 1、数据类型
数据类型描述
* Byte 8bit的有符号数字,范围在-128 -- 127
* Short 16 bit有符号数字,范围在-32768 -- 32767
* Int 32 bit有符号数字,范围-2147483648到2147483647
* Long 64 bit 有符号数字,范围-9223372036854775808到9223372036854775807
* Float 32 bit IEEeS754单精度浮点数
* Double 64 bit IEEE 754双精度浮点数
* Char 16 bit Unicode字符.范围U+0000到U+FFFF
* String字符串
* Boolean布尔类型
* Unit表示无值,和其他语言中void等同
* Null空值或者空引用
* Nothing所有其他类型的子类型,表示没有值
* Any所有类型的超类,任何实例都属于Any类型
* AnyRef所有引用类型的超类
* AnyVal所有值类型的超类  （Val 用来描述静态不可变数据，相当于Java中的static final）

以上数据类型都是封装后的对象，首字母全部大写

|||
|:-----  |:----- |
| Null| Trait ,其唯-实例为null ,是AnyRef的子类, *不是* AnyVal的子类|
|Nothing|Trait ,所有类型(包括AnyRef和AnyVal )的子类,没有实例|
|None|Option的两个子类之一, 另-一个是Some ,用于安全的函数返回值|
|Unit|无返回值的函数的类型,和java的void对应|
|Nil|长度为0的List|


## 2.变量和常量的赋值
* val  定义常量相当于Java 中的 static final 是不可修改的
* var 定义变量，可以修改

## 3. 类和对象
1. Scala object 相当与java中的单例，object中定义的全是静态的，相当于java中的工具类
2. Scala中定义变量使用var，定义常量使用val，变量可变，常量不可变。变量和常量类型可以省略不写，会自动推断参数类型。
3. Scala中每行后面都会有分号推断机制，不用显式写“：”。
4. Scala类中可以传参，传参要指定类型，有了参数就有了默认的构造。类中的属性默认有getter，setter方法 
5. 类中重写构造时，构造第一行必须先调用默认的构造
6. Scala中 当new class时，类中除了方法不执行，其他都执行 (因此可能在类中其他位置给类中属性赋值)
7. 在同一个Scala文件中，class名称和Object名称一样时，这个类叫做这个对象的伴生对象，他们之间可以互相访问私有变量


**创建类**
```scala
class Person{
	val name = xname
	val age = xage
	
	 // 定义方法
  def seyHello() = {
    "my name is "+ name
  }
}
```

**创建对象**
```scala
object Leson_ClassAndObje {
  val name = "wangwu"

  def main(args: Array[String]): Unit = {
    val p = new Person("zhangsan", 30,'F')
    println(p.name)
    println(p.age)
  }
}
```


**类中的apply方法**
object中不可以传参，当创建一个object时，如果传入参数，会自动寻找object中相应参数个数的apply方法。

```scala
object Object_Apply {
  def apply(num: Int): Unit = {
    println("Score is " + num)
  }

  def main(args: Array[String]): Unit = {
    Object_Apply(50)
  }
}
```

## 4. Scala 简单语法
**if...else... 条件**
```scala
   // if ... else ....
    val age = 20
    if (age < 20) {
      //do something
    } else if (age <= 30) {
      // do something
    } else {
      // do something
    }
```

**for循环**
```scala
for (i <- 1 to (10)) {
      println(i)
    }
```
* to 是一个range集合，包含末尾元素
* until 也是range集合，不包括末尾元素

```scala
for (i <- 1.until(10)) {
       for (j <- 1.until(10)) {
         if (i >= j) {
           print(i + "*" + j + "=" + i * j + "\t")
         }
         if (i == j) {
           println()
         }
       }
}
// 双层for循环语句可简化
for (i <- 1.until(10); j <- 1.until(10)) {
       if (i >= j) {
         print(i + "*" + j + "=" + i * j + "\t")
       }
       if (i == j) {
         println()
       }
}

for (i <- 1.to(20) if (i > 10) if (i % 2 == 0)) {
      println(i)
}

// 使用 yield 关键字返回的是一个满足条件的集合
val result = for (i <- 1.to(20) if (i > 10) if (i % 2 == 0)) yield i
println(result)

```

# Scala 方法与函数
