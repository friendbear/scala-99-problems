/**
  * Created by n.kusagaya on 2017/03/08.
  */
object ScalaQuiz14 {
  def main(args: Array[String]): Unit = {
    val list = List('a, 'b, 'c, 'c, 'd)
    println(duplicate(list))
  }

//  // ものすごい無駄なことをしていた・・・
//  def duplicate[A](list: List[A]): List[A] = {
//    def loop(tempList:List[A], newList:List[A]): List[A] = tempList match {
//      case x :: tail => loop(tail, newList :+ x :+ x)
//      case Nil => newList
//    }
//    loop(list, List())
//  }

  def duplicate[A](list: List[A]): List[A] = list flatMap { e => List(e, e) }
}
