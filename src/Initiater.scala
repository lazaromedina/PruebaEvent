import scala.collection.mutable.ListBuffer

/**
 * Created by luis on 24/08/15.
 */
class Initiater {

  val listeners: ListBuffer[HelloListener] = new ListBuffer[HelloListener]

  def addListener(toAdd: HelloListener):Unit =  {
   toAdd +=:listeners
  }

  def sayHello: Unit = {
    println("hello!!!")
    // Notify everybody that may be interested.
    listeners foreach(_.someonSaidHello)
  }


}
