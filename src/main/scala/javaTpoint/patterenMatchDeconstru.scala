package javaTpoint

object patterenMatchDeconstru {

  class Message(p_id: String, p_meg: String){
    val id = p_id;
    val msg = p_meg
  }
  def main(args: Array[String]): Unit = {

  }

}
/*
case class Message(p_d: String, p_msg: String)
val messageList = List(Message("tom@gmail.com","message text 1"),
  Message("704454356","message text 2") ,
  Message("879665432","message text 3"),
  Message("lisa@gmail.com","message text 4"),
  Message("lisa@yahoo.com","message text 5"),
  Message("harry@gmail.com","message text 6")
)

 */