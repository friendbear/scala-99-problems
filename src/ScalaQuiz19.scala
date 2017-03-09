/**
  * Created by n.kusagaya on 2017/03/09.
  */
object ScalaQuiz19 {
  def main(args: Array[String]): Unit = {
    val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    println(rotate(3, list))
    println(rotate(-2, list))
  }

  def rotate[A](i: Int, list:List[A]): List[A] = {
    if (i.abs == i) list.drop(i) ::: list.take(i)
    else list.takeRight(i.abs) ::: list.dropRight(i.abs)
  }
}
