package javaTpoint

object sectionone {
  def main(args: Array[String]): Unit = {
    println("welcome to Scala Python Programming")
    // do while loop examples

    var a = 10
    do{
      println(a)
       a= a+2
    }
    while (a <= 20)





    /*
    // while loop examples
    var a = 10
    while (a <= 20){
      println(a)
      a = a+2
    }
    */
    // examples for patteren matching
    /*
    val res = search("hello")
    print(res)
     */

    /*
    var a = 1
    a match{
      case 1 => println("one")
      case 2 => println("two")
      case _ => println("no ")
    }

     */


    // Conditional statements excamples
    /*
    //sampleFun()
    val age: Int = 18
    if (age >=18){
      println("your are elegiable for voting")
    }

    var num: Int = 21
    if (num % 2 ==0){
      println("even num,ber")
    }else{
      println("odd number")
    }

     */
  }

  def sampleFun(): Unit = {
    println("hello scala function")
  }


  def search(a: Any): Any= a match {
    case 1 => println("one")
    case "two" => println("two")
    case "hello" => println("hello")
    case _ => println("none")
  }

}
