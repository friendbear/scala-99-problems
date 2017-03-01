/**
  * Created by n.kusagaya on 2017/03/02.
  */
object ScalaQuiz4 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 1, 2, 3, 5, 8)
    val listB = List("a", "b", "c", "d", "e", "f", "g")
    println(length(listB))
  }

  def length[T](list: List[T]):Int = {
    def loop(n:Int, tmp:List[T]):Int = tmp match {
      case _::Nil => n
      case _::y   => loop(n + 1, y)
      case _      => sys.error("error!")
    }
    loop(0, list)
  }
}
