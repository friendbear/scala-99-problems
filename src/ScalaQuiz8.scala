/**
  * Created by n.kusagaya on 2017/03/06.
  */
object ScalaQuiz8 {
  def main(args: Array[String]): Unit = {
    val list = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
    println(compress(list))
  }

//  def compress[A](list: List[A]): List[A] = list match {
//    case x :: y :: z => {
//      if (x == y) compress(y :: z)
//      else compress(x :: y :: z)
//    }
//  }

  def compress[A](list: List[A]): List[A] = list match {
    case x :: y => x :: compress(y.dropWhile(_ == x))
    case Nil => Nil
  }
}
