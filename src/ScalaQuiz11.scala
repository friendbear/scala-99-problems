/**
  * Created by n.kusagaya on 2017/03/06.
  */
object ScalaQuiz11 {
  import ScalaQuiz10.encode

  def main(args: Array[String]): Unit = {
    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    println(encodeModified(list))
  }

  def encodeModified(list: List[Symbol]): List[Any] = {
    encode(list).map{ t =>
      if (t._1 == 1) t._2
      else t
    }
  }
}
