/**
  * Created by n.kusagaya on 2017/03/14.
  */
object ScalaQuiz27 {

  import ScalaQuiz26._

  def main(args: Array[String]): Unit = {
    val list = List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")
    println(group3(list))
    println(group(List(3,4,2), list))
  }

  /**
    * 問題
    *
    * 9人から3つのグループを作る際の組み合わせの可能性を全て求めなさい。
    * 但し、
    * 1つ目のグループは2人
    * 2つ目のグループは3人
    * 3つ目のグループは4人
    * とする。
    */
  def group3[A](list: List[A]): List[List[List[A]]] = {
    for {
      a <- combinations(2, list)
      noA = list diff a
      b <- combinations(3, noA)
    } yield List(a, b, noA diff b)
  }

  /**
    * 問題
    *
    * list から splitList に書かれた人数でグループを作り、その組み合わせを全て求めなさい。
    * 例）
    * List(3,4,2)だった場合は、3人、4人、2人の3つのグループを作り、その組み合わせを全て求めます。
    * List(2,2,2,3)だった場合は、2人、2人、2人、3人の4つのグループを作り、その組み合わせを全て求めます。
    */
  def group[A](splitList: List[Int], list: List[A]): List[List[List[A]]] = splitList match {
    case Nil => List(Nil)
    case head :: tail => combinations(head, list) flatMap { c =>
      group(tail, list diff c) map {c :: _}
    }
  }
}
