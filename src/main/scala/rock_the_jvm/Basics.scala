package rock_the_jvm

object Basics {
  def main(args: Array[String]): Unit = {

    // defining a value
     val meaningOfLife: Int = 42
    //meaningOfLife = 43

    val aBoolan = false // type is oiptional


    // String or String operations
    val aString = "i love scala"
    val aComposedString = "I"+ " "+ "love" + " "+ "Scala"
    val anInterpolatedString = s"The meaning of life is $meaningOfLife"

    //expressions = structures that can be reduce the values

    val anExpression = 2+3

    // if-expression

    val ifExpression = if (meaningOfLife > 43) 56 else 999 //

    val chainIfExpression  =
      if(meaningOfLife> 43) 55
      else if (meaningOfLife <0) -2
      else if(meaningOfLife> 999) 78
      else 0


    // code blocks

        val aCodeBlock={
          //definition
          //local values, class, inner block
          // but we have return value
          val aLocalValue =67
          aLocalValue+3

          //value of block is the value of the last expression

        }

    // define function

    def myFunction(x:Int, y: String): String = y+ " " + x
    // both ways we can implemet that
    // code is also experssion
    def myFunction1(x:Int, y: String): String={
      y+ " "+ x
    }


    // recursive functions

    def fact(n: Int):Int =
      if (n <= 1) 1
      else n*fact(n-1)




  }

}
