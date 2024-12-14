package weekend_dec

object PatterenMatching {

  // 1 - switch on steroids
  var number = 44
  val ordinal = number match{
    case 1 => "first"
    case 2 => "second"
    case 3 => "thrid"
    case _ => number+"none"
  }

  //2 - case class deconstructions
  case class Person(name: String, age:Int)
  val bob = Person("bob", 35)
  val bobGreet = bob match{
    case Person(n,a) => s"Hi my name $n and i am $a of years of old"
  }

  // 3 -list extractions

  val numberList = List(1,2,3,4)
  val mustHaveThree = numberList match{
    case List(_,_,3,somethingelse) => s"List has 3 rd element is 3, so the 4th element is $somethingelse"
  }

  // 4 one is prepending
  val startswithOne = "hello"

  def main(args: Array[String]): Unit = {
    println("Welcome to Scala Programming patteren matching examples ")
    //println(bobGreet)
    //println(mustHaveThree)

  }

}
