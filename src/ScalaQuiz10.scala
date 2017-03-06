/**
  * Created by n.kusagaya on 2017/03/06.
  */
object ScalaQuiz10 {
  def main(args: Array[String]): Unit = {
    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    println(encode(list))
  }

  def encode(list: List[Symbol]): List[(Int, Symbol)] = {
    val (packed, next) = list span{ _ == list.head }
    val result = (packed.length, packed.head)
    if (next == Nil) List(result)
    else List(result) ::: encode(next)
  }
}
