package javaTpoint

object forLoop {
  def main(args: Array[String]): Unit = {
    println("welcome to scala loop examples")
    // yield keyword examples .................................

    var squares = for ( i <- 1 to 5) yield i*i
    println(squares)

    var evenNum = for ( i <- 1 to 10 if i % 2 ==0) yield i
    println(evenNum)

    val pairs = for {
      x <- 1 to 3
      y <- 2 to 5
    } yield (x,y)
    println(pairs)

    val words = List("hello scala welcome to coding")
    val upperWords = for (word <- words ) yield word
    println(upperWords)


    case class Person(name: String, age: Int)
    val people = List(Person("Alice", 25), Person("Bob", 30), Person("Charlie", 20))
    val audult  = for ( people <- people if people.age >= 25) yield people.name
    println(audult)



























    /*
        var lst = List(1,2,3,4,5,6,8)
        for (i <- lst){
          println(i)
        }

        lst.foreach{
          println // Print each element
        }




            for (a <- 1 to 10 if a % 2==0){
              println(a)
            }


                for(a <- 1 until(10)){
                  println(a)
                }

                for(a <- 1 to 10){
                  println(a)
                }
                 */
  }

}
