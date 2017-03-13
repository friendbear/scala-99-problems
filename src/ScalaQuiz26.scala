/**
  * Created by n.kusagaya on 2017/03/13.
  */
object ScalaQuiz26 {
  def main(args: Array[String]): Unit = {
    val list = List('a, 'b, 'c, 'd, 'e, 'f)
    println(combinations(3, list))
    println(combinations2(3, list))
  }

  /**
    * 問題
    *
    * list から n 件取る時の組み合わせを全て求めなさい。
    */
  def combinations[A](n:Int, list:List[A]): List[List[A]] = list.combinations(n).toList

  def flatMapSublists[A,B](ls: List[A])(f: (List[A]) => List[B]): List[B] = {
    ls match {
      case Nil => Nil
      case sublist@(_ :: tail) => f(sublist) ::: flatMapSublists(tail)(f)
    }
  }

  def combinations2[A](n: Int, ls: List[A]): List[List[A]] = {
    if (n == 0) List(Nil)
    else flatMapSublists(ls){
      sl => {
        val res = combinations2(n - 1, sl.tail)
        res.map(m => sl.head :: m)
      }
    }
  }
}
