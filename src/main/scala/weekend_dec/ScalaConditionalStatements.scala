package weekend_dec

object ScalaConditionalStatements {
  def main(args: Array[String]): Unit = {
    println("welcome to scala conditional statemnts ")
    val res = checklt(-10)
    println(res)
    //val age:Int = 20
    /*
    if(age > 18){
      print("age is greater then 18 so go for voteing Today")
    }

    val num: Int= 22
    if(num % 2 == 0) println("even")
    else println("odd")

     */
  }
  def checklt(a:Int) = if(a >=0) 1 else -1

}
