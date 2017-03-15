/**
  * Created by n.kusagaya on 2017/03/14.
  */
object ScalaQuiz28 {
  import ScalaQuiz10._

  def main(args: Array[String]): Unit = {
    val list = List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o), List('p), List('q), List('r))
    //println(lsort(list))
    println(lsortFreq(list))
  }

  /**
    * 問題
    *
    * list の中の List の長さが短い順に並べ直しなさい。
    */
  def lsort[A](list:List[List[A]]): List[List[A]] = {
    list.sortWith((a, b) => a.length < b.length)
  }

  /**
    * 問題
    *
    * list の中の List の長さが同じものの出現回数が少ない順に並べ直しなさい。
    *
    * 例1）
    * List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o))
    * 解1） Listの長さが4と1のものが1回、長さが3のものが2回、長さが2のものが3回。
    * List(List('i, 'j, 'k, 'l), List('o), List('a, 'b, 'c), List('f, 'g, 'h), List('d, 'e), List('d, 'e), List('m, 'n))
    *
    * 例2）
    * List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o), List('p), List('q), List('r))
    * 解2） Listの長さが4のものが1回、長さが3のものが2回、長さが2のものが3回、長さが1のものが4回。
    * List(List('i, 'j, 'k, 'l), List('a, 'b, 'c), List('f, 'g, 'h), List('d, 'e), List('d, 'e), List('m, 'n), List('o), List('p), List('q), List('r))
    */
  def lsortFreq[A](list: List[List[A]]): List[List[A]] = {
    val freqs = Map(encode(list map { _.length } sortWith {(a, b) => a < b}) map { _.swap }:_*)
    list sortWith { (e1, e2) => freqs(e1.length) < freqs(e2.length) }
  }
}
