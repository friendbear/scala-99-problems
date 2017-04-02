/**
  * Created by n.kusagaya on 2017/03/13.
  */
object ScalaQuiz25 {
  import ScalaQuiz23._

  def main(args: Array[String]): Unit = {
    val list = List('a, 'b, 'c, 'd, 'e, 'f)
    println(randomPermute(list))
  }

  /**
    * 問題
    *
    * list の順番をランダムに並び替えて返しなさい。
    */
  def randomPermute[A](list: List[A]): List[A] = randomSelect2(list.length, list)
}
