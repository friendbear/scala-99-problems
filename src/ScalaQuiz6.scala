import ScalaQuiz5._

/**
  * Created by n.kusagaya on 2017/03/02.
  */
object ScalaQuiz6 {
  def main(args: Array[String]): Unit = {
//    val list  = List(1, 2, 3, 2, 1)
//    val listB = List(1, 2, 3, 3, 1)
    val listC = List("a", "b", "c", "d", "c", "b", "a")
    println(isPalindrome(listC))
  }

  def isPalindrome[T](list: List[T]):Boolean = list == reverse(list)
}
