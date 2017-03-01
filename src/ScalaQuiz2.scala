/**
  * Created by n.kusagaya on 2017/03/01.
  */
object ScalaQuiz2 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 1, 2, 3, 5, 8)
    println(penultimate(list))
  }

  def penultimate(list: List[Int]):Int = {
    list.apply(list.length - 2)
  }

}
