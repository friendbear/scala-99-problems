/**
  * Created by n.kusagaya on 2017/03/01.
  */
object ScalaQuiz1 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 1, 2, 3, 5, 8)
    println(last(list))
  }

  def last(list: List[Int]):Int = list.apply(list.length - 1)
}