/**
  * Created by n.kusagaya on 2017/03/08.
  */
object ScalaQuiz17 {
  def main(args: Array[String]): Unit = {
    val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    println(splitFunctional(3, list))
  }

  def split[A](n:Int, list:List[A]): (List[A], List[A]) = list.splitAt(n)

  def splitFunctional[A](n: Int, list:List[A]): (List[A], List[A]) = (list.take(n), list.drop(n))
}
