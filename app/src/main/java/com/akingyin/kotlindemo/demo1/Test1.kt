package com.akingyin.kotlindemo.demo1

/**
 * 定义函数 及局部变量
 * @ Description:
 * @author king
 * @ Date 2018/2/11 10:48
 * @version V1.0
 */

class Test1{
    //定义一个函数接受两个 int 型参数，返回值为 int ：
    fun sum(a: Int , b: Int) : Int{
        return a + b
    }

    //该函数只有一个表达式函数体以及一个自推导型的返回值：
    fun sum2(a: Int, b: Int) = a + b


    //返回一个没有意义的值：
    fun printSum(a: Int, b: Int): Unit {
        println("sum of $a and $b is ${a + b}")
    }

    //Unit 的返回类型可以省略：
    fun printSum2(a: Int, b: Int) {
        println("sum of $a and $b is ${a + b}")
    }



    /******************************定义局部变量***********************************/

//声明常量：
    fun main(args: Array<String>) {
        val a: Int = 1  // 立即初始化
        val b = 2   // 推导出Int型
        val c: Int  // 当没有初始化值时必须声明类型
        c = 3       // 赋值
        println("a = $a, b = $b, c = $c")
    }

    //变量
    fun main2(args: Array<String>) {
        var x = 5 // 推导出Int类型
        x += 1
        println("x = $x")
    }


    /******************************字符串模版***********************************/

    fun main3(args: Array<String>) {
        var a = 1
        // 使用变量名作为模板:
        val s1 = "a is $a"

        a = 2
        // 使用表达式作为模板:
        val s2 = "${s1.replace("is", "was")}, but now is $a"
        println(s2)
    }

    /******************************可空变量及空值检测***********************************/
   // 在 Kotlin 类型系统中可以为空和不可为空的引用是不同的。比如，普通的 String 类型的变量不能为空：

//    var a: String ="abc"
//    a = null //编译错误　
//    允许为空，我们必须把它声明为可空的变量：
//
//    var b: String? = "abc"
//    b = null
//    现在你可以调用 a 的方法，而不用担心 NPE 异常了：

//    val l = a.length()
//    但如果你想使用 b 调用同样的方法就有可能报错了：
//
//    val l = b.length() //错误：b 不可为空
//    但我们任然想要调用方法，有些办法可以解决。



  //  当空值可能出现时应该明确指出该引用可空。

    //下面的函数是当 str 中不包含整数时返回空:

    fun parseInt(str : String): Int?{
        //...
        return str.toInt()
    }


    fun parseInt2(str: String): Int? {
        return str.toIntOrNull()
    }


    //安全调用
   // 第二个选择就是使用安全操作符，?.:
   // 如果 b 不为空则返回长度，否则返回空。这个表达式的的类型是 Int?
    fun  getStrLength(str:String?):Int?{
        return  str?.length
    }


   // 使用值检查并自动转换
   fun getStringLength(obj: Any): Int? {
       if (obj is String) {
           // obj 将会在这个分支中自动转换为 String 类型
           return obj.length
       }

       // obj 在种类检查外仍然是 Any 类型
       return null
   }

    fun getStringLength2(obj: Any): Int? {
        if (obj !is String) return null

        // obj 将会在这个分支中自动转换为 String 类型
        return obj.length
    }

   // 使用 when 表达式
   fun describe(obj: Any): String =
           when (obj) {
               1          -> "One"
               "Hello"    -> "Greeting"
               is Long    -> "Long"
               !is String -> "Not a string"
               else       -> "Unknown"
           }


    //使用ranges


    //检查 in 操作符检查数值是否在某个范围内(>=&&<=)：

    fun  rangesIn(){
        val x = 10
        val y = 9
        if (x in 1..y+1) {
            println("fits in range")
        }

        val list = listOf("a", "b", "c")

        if (-1 !in 0..list.lastIndex) {
            println("-1 is out of range")
        }
        if (list.size !in list.indices) {
            println("list size is out of valid list indices range too")
        }
        println()
        //在范围内迭代
        for (x in 1..5) {
            print(x)
        }

        //或者使用步进
        println()
        for (x in 1..10 step 2) {
            print(x)
        }
        for (x in 9 downTo 0 step 3) {
            print(x)
        }
    }



    //使用lambda表达式过滤和映射集合：
    fun   fruits(){
        val fruits = listOf("banana", "avocado", "apple", "kiwi")

        //如果字面函数只有一个参数，则声明可以省略，名字就是 it :
        fruits.filter { it.startsWith("a") }
                .sortedBy { it }
                .map { it.toUpperCase() }
                .forEach { println(it) }
    }
}




