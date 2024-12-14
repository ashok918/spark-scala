package javaTpoint
import scala.io.StdIn.readLine

object doWhileExamples {
  def main(args: Array[String]): Unit = {
    println("do while examples")
    var input=""
    do{
      println(s"you type something like 'exit' to quit")
      input = readLine()
      println(s"you typed $input")
    }
    while(input != "exit")







    /*
    var counter = 0
    do{
      println(counter)
      counter = counter+1
    }
    while(counter < 10)

     */
  }

}
