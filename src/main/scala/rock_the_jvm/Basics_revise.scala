package rock_the_jvm

object Basics_revise {
  def main(args: Array[String]): Unit = {
    println("Welcome to Scala Programming . i need to cover basics of scala Programming")

    // defining value

    val meaningOfLife: Int = 42
    //meaningOfLife= 45

    // Int, Boolean, Char, Double, Float, String
    val oBoolean = false // type is optinal

    val aString ="I love Scala"

    val aComposedString = "I" +" " + "love" + " " + "scala"

     //println(aComposedString)

    val anInterpolatedString = s"the meaning of the life is $meaningOfLife"

    //expressions = structures that can be reduced to a value
    val anExpression = 2+3
    // if statement also called expression
    val isExpression  = if (meaningOfLife > 45) 56 else 999

    val chainedExpression = {
      if(meaningOfLife > 43) 56
      else if(meaningOfLife < 0) -2
      else if(meaningOfLife > 999) 78
      else 0
    }

   // code blocks

   val aCodeBlock ={
     //definition of local values
     val aLocalVCalue=40
     // value of block is the value of the last expression
     aLocalVCalue + 3

   }

    // functions

    def myFunction(x: Int, y: String): String = y +" "+x

    def myFunctiontwo(x: Int, y: String) ={

      y +" "+x

    }

    //recursive functions

     def fact(n: Int): Int ={
       if (n <= 1) 1
       else n*fact(n-1)

     }

    // in Scala we don't use loops or itrations , we use RECURsions
    // the unit return type = no meaning value == void in other language
    /*
    side effects
    1. printing something in a screen
    2. showing something in sscreen , sending something socket or server , storing  in a file
    println("i love scala") // System.out.println, printf,print console.log comes under void

     */

    def myUnitFunction():Unit={
      println("i don't love returning Unit")

    }






  }

}
