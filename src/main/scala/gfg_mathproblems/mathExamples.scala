package gfg_mathproblems

import scala.math.abs

object mathExamples {
  def sumofn(n: Int): Int={
    val sum = n*(n+1)/2
    sum
  }

  def absoluteValue(n: Int): Int={
    val abso = abs(n)
    abso
  }

  def celsiusToFahrenheit(C: Int): Float={
    val cToF = (C * 9/5) +32
    cToF
  }

  def countTheDigits(n: Int): Int ={
    var num = n
    var res = 0

    while (num > 0){
      num = num/10
      res = res+1

    }
    res

  }

  def main(args: Array[String]): Unit = {
    /*
    val n = 10
    val result = sumofn(n)
    println(s"the sum of first $n natural numbers is: $result")

    val n1 = -32
    val result1 = absoluteValue(n1)
    println(s"the absolutue of given $n1 is: $result1")


    val C = 32
    val res = celsiusToFahrenheit(C)
    println(s"the conver of celsuis to fahreinheit is : $res")
    */

    val n = 0
    val res = countTheDigits(n)
    println(s"the count of given number is : $res")


  }

}
