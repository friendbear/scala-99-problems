/**
  * Created by n.kusagaya on 2017/03/09.
  */
object ScalaQuiz21 {
  def main(args: Array[String]): Unit = {
    val list = List('a, 'b, 'c, 'd)
    println(insertAt('new, 1, list))
  }

  def insertAt[A](i:A, p: Int, list:List[A]): List[A] = {
    val b  = list.toBuffer
    b.insert(p, i)
    b.toList
  }

  def insertAt2[A](i:A, p: Int, list:List[A]): List[A] =  list.splitAt(p) match {
    case (pre, post) => pre ::: i :: post
  }
}
