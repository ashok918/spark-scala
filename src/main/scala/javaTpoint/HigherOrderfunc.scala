package javaTpoint

object HigherOrderfunc {
  def main(args: Array[String]): Unit = {
    println("welcome to Higherorder functions")

    funExample(20,mulBy2)

  }

  def funExample(a: Int, f:Int => AnyVal)={
    println(f(a))
  }

  def mulBy2(a:Int): Int={
    a*2
  }



}
