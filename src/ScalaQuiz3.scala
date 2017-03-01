/**
  * Created by n.kusagaya on 2017/03/01.
  */
object ScalaQuiz3 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 1, 2, 3, 5, 8)
    val listB = List("a", "b", "c", "d", "e", "f")
    println(nth(4, listB))
  }

  def nth[T](index:Int, list: List[T]):T = list match {
    case x::_ if index == 0 => x
    case _::y => nth(index - 1, y)
    case _ => sys.error("error!")
  }
}
