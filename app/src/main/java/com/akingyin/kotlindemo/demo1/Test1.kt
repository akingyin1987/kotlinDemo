package com.akingyin.kotlindemo.demo1

/**
 * 定义函数 及局部变量
 * @ Description:
 * @author king
 * @ Date 2018/2/11 10:48
 * @version V1.0
 */



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


