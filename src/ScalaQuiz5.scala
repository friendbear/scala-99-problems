import scala.annotation.tailrec

/**
  * Created by n.kusagaya on 2017/03/02.
  */
object ScalaQuiz5 {
  def main(args: Array[String]): Unit = {
    val list  = List(1, 1, 2, 3, 5, 8)
    val listB = List("a", "b", "c", "d", "e", "f", "g")
    println(reverse(listB))
  }

  def reverse[T](list: List[T]):List[T] = {
    @tailrec
    def loop(list:List[T], tmp:List[T]):List[T] = list match {
      case Nil  => tmp
      case x::y => loop(y, x :: tmp)
      case _    => sys.error("error!")
    }
    loop(list, List())
  }
}
