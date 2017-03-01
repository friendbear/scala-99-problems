/**
  * Created by n.kusagaya on 2017/03/01.
  */
object ScalaQuiz3 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 1, 2, 3, 5, 8)
    println(nth(5, list))
  }

  def nth(index:Int, list: List[Int]):Int = list match {
    case x::_  if index == 0 => x
    case _::xs if index >  0 => nth(index - 1, xs)
    case _ => sys.error("")
  }
}
