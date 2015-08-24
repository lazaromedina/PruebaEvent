/**
 * Created by luis on 24/08/15.
 */


object Test {

  def main(args : Array[String]): Unit = {
  val initiater: Initiater = new Initiater
    val responder : Responder = new Responder
    initiater.addListener(responder)
    initiater.sayHello
  }
}
