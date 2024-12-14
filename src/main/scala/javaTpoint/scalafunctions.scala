package javaTpoint

object scalafunctions {
  def main(args: Array[String]): Unit = {
    println("welcome to scala programming.................")
    var res1 = funWithdefaultPara(10,2)
    println(res1)

    var res2 = funWithdefaultPara(20)
    println(res2)

    var res3 = funWithdefaultPara()
    print(res3)




    //samplefunc()
    //var res = funcExample()
    //println(res)

    //val res = funcExample(10,20)
    //println(res)

    //var res =  funcRes(10,30)
    //print(res)


  }

  def funWithdefaultPara(a: Int=0, b: Int=10):Int ={
    a+b
  }
  /*
  def samplefunc(): Unit = {
    println("this is just sample functions")
  }


  def funcExample() = {
    var a = 10
    a
  }


  def funcExample(a: Int, b:Int): Int= {
    var c = a+b
    c
  }

  def funcRes(a: Int, b:Int): Int={
    if(b==0) 0 else a+funcRes(a, b-1)
  }

  */


}
