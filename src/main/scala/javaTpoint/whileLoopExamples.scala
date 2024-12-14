package javaTpoint
import scala.io.StdIn.readLine

object whileLoopExamples {
  def main(args: Array[String]): Unit = {
    println("welcome to examples for scala while loop examples")

    var input =""
    while(input != "exit"){
      println(s"type some like 'exit' to quit")
      input = readLine()
      println(s"you printed $input")

    }




    /*
    var num = 10
    while(num > 0){
      if (num%2 == 0){
        println(s"number is $num")
      }else{
        println(s"number is odd")
      }
      num -= 1

    }


    var counter: Int = 0
    while(counter <= 5){
      println(s"the counter value : $counter")
      counter +=1
    }

     */
  }

}
