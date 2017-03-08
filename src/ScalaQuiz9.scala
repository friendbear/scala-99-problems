/**
  * Created by n.kusagaya on 2017/03/06.
  */
object ScalaQuiz9 {
  def main(args: Array[String]): Unit = {
    val list = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
    println(pack(list))
  }

//  def pack[A](list: List[A]): List[A] = {
//    list match {
//      case first :: tailList => {
//        val newList = first :: tailList.takeWhile(_ == first)
//        pack(tailList.dropWhile(_ == first))
//      }
//      case Nil => Nil
//    }
//  }

  def pack[A](ls: List[A]): List[List[A]] = {
    if (ls.isEmpty) List(List())
    else {
      val (packed, next) = ls span { _ == ls.head }
      if (next == Nil) List(packed)
      else packed :: pack(next)
    }
  }
}
