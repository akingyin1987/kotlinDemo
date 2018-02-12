package com.akingyin.kotlindemo.demo1

import org.junit.Test

/**
 * @author king
 * @version V1.0
 * @ Description:
 * @ Date 2018/2/11 10:49
 */

class Test1KtTest {

    @Test
    fun sum() {
        var test = Test1()
      var result =  test.sum(1,2)
      print("result="+result+":"+test.sum2(2,result))
       test.printSum(result,3)
        test.printSum2(3,result)
    }


    @Test
    fun parseInt(){
        var test = Test1()
     // val  result = test.parseInt("3")
     var  result = test.parseInt2("e")
        println(result)
    }

    @Test
    fun  getLength(){
        var  test = Test1()
        var  str :String?="2333"
        str=null
        println(test.getStrLength(""))
        println(test.getStrLength(null))
    }

    @Test
    fun   getStringLength(){
        var  test = Test1()
        println(test.getStringLength(1))
        println(test.getStringLength("22222"))
    }


    //for循环
    @Test
    fun   testlist(){
        val items = listOf("apple", "banana", "kiwi")
        for (item in items) {
            println(item)
        }

        for (index in items.indices) {
            println("item at $index is ${items[index]}")
        }
    }

    //使用 while 循环
    @Test
    fun   testlist2(){
        val items = listOf("apple", "banana", "kiwi")
        var index = 0
        while (index < items.size) {
            println("item at $index is ${items[index]}")
            index++
        }
    }

   // 使用 when 表达式
    @Test
    fun  testlist3(){
       var   test = Test1()
       println(test.describe(1))
       println(test.describe("Hello"))
       println(test.describe(1000L))
       println(test.describe(2))
       println(test.describe("other"))
    }

    //使用ranges
    @Test
    fun   testrand(){
        var   test = Test1()
        test.rangesIn()
    }

    @Test
    fun   testfruits(){
        var   test = Test1()
        test.fruits()
    }

}