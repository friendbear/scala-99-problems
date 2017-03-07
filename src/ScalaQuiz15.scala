/**
  * Created by n.kusagaya on 2017/03/08.
  */
object ScalaQuiz15 {
  def main(args: Array[String]): Unit = {
    val list = List('a, 'b, 'c, 'c, 'd)
    println(duplicateN(3, list))
  }

  def duplicateN[A](l: Int, list: List[A]): List[A] = list flatMap { e => (1 to l).toList.map(_ => e) }
}
