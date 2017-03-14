/**
  * Created by n.kusagaya on 2017/03/06.
  */
object ScalaQuiz12 {
  def main(args: Array[String]): Unit = {
    val list = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
    println(decode(list))
  }

  def decode[A](list: List[(Int, A)]): List[A] = {
    list flatMap { f =>
      def loop(i:Int, v:A, l:List[A]): List[A] = {
        if (i == 0) l
        else loop(i - 1, v, v :: l)
      }
      loop(f._1, f._2, List())
    }
  }
}
