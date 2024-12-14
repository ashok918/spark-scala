package javaTpoint
import commons.commonmethods

object closures {

  var p = 10
  def getHike(sal: Double) = sal*p/100

  def main(args: Array[String]): Unit = {
    println("welcome to closures examplesss")
    println(getHike(10000))


  }

  val l =( 1000 to 1005).toList
     //l.map(getHike)

}
