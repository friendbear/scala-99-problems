import scala.collection.mutable.ArrayBuffer

/**
  * Created by n.kusagaya on 2017/03/09.
  */
object ScalaQuiz20 {
  def main(args: Array[String]): Unit = {
    val list = List('a, 'b, 'c, 'd)
    println(removeAt(1, list))
  }

  def removeAt[A](i:Int, list:List[A]): (List[A], A) = {
    if (i < 0 || i >= list.length) sys.error("error!")
    val b  = list.toBuffer
    val br = b.remove(i)
    (b.toList, br)
  }
}
