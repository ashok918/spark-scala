package rock_the_jvm

object ObjectOriented {
  def main(args: Array[String]): Unit = {

    // class and instance
    class Animal{
      // difine the fields
      val age: Int = 0
      // definine the methods
      def eat() = println("i am eating")

    }
    val anAnimal = new Animal


    // inhertance
    class Dog extends Animal
    class Cat(val name: String) extends Animal // Constructor definition
    val aCat = new Cat("Lassie")
    // constructor arguments are not fields
    // to promote constructor value to make the fileds with val now
    aCat.name
  }

}
