/**
  * Created by n.kusagaya on 2017/03/08.
  */
object ScalaQuiz13 {
  def main(args: Array[String]): Unit = {
    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    println(encodeDirect(list))
  }

  def encodeDirect[A](list:List[A]):List[(Int, A)] = {
    if (list.isEmpty) List()
    else {
      val (packed, next) = list span { _ == list.head }
      (packed.length, packed.head) :: encodeDirect(next)
    }
  }
}
