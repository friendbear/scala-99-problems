/**
  * Created by n.kusagaya on 2017/03/08.
  */
object ScalaQuiz16 {
  def main(args: Array[String]): Unit = {
    val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    println(dropBuildIn(3, list))
  }

  def drop[A](n: Int, list: List[A]): List[A] = {
    def loop[A](ls:List[A], newList:List[A]): List[A] = ls match {
      case x :: y :: z :: tail => loop(tail, newList :+ x :+ y)
      case x :: y :: tail => loop(tail, newList :+ x :+ y)
      case x :: tail => loop(tail, newList :+ x)
      case _ => newList
    }
    loop(list, List())
  }

  def dropBuildIn[A](n: Int, list:List[A]): List[A] = list.drop(n)

  def dropFunctional[A](n: Int, list:List[A]): List[A] = list.zipWithIndex filter { v => (v._2 + 1) % n != 0 } map { _._1 }
}
