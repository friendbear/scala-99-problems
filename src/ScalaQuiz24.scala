import scala.util.Random

/**
  * Created by n.kusagaya on 2017/03/10.
  */
object ScalaQuiz24 {

  def main(args: Array[String]): Unit = {
    println(lotto(6, 49))
  }

  def lotto(a:Int, b:Int): List[Int] = (1 to a).map(_ => Random.nextInt(b)).toList

  def lotto2(a:Int, b:Int): List[Int] = ScalaQuiz23.randomSelect(a, List.range(1, b + 1))
}
