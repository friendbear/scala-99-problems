/**
  * Created by n.kusagaya on 2017/03/10.
  */
object ScalaQuiz22 {
  def main(args: Array[String]): Unit = {
    println(range(4, 9))
  }

  def range(s:Int, e:Int):List[Int] = Range(s, e + 1).toList

  def range2(s:Int, e:Int):List[Int] = List.range(s, e + 1)
}
