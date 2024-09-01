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

  }

}
