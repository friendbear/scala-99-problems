/**
  * Created by n.kusagaya on 2017/03/08.
  */
object ScalaQuiz18 {
  def main(args: Array[String]): Unit = {
    val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    println(sliceFunctional(3, 7, list))
  }

  def mySlice[A](pos: Int, length: Int, list: List[A]): List[A] = list.slice(pos, length)

  def sliceFunctional[A](pos: Int, length: Int, list: List[A]): List[A] = list.drop(pos).take(length - (pos max 0))
}
