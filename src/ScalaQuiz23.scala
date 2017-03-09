import scala.util.Random

/**
  * Created by n.kusagaya on 2017/03/10.
  */
object ScalaQuiz23 {
  def main(args: Array[String]): Unit = {
    println(randomSelect2(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h)))
  }

  def randomSelect[A](i:Int, list:List[A]):List[A] = Random.shuffle(list).take(i)

  def randomSelect2[A](i:Int, list:List[A]):List[A] = {
    if (i <= 0) Nil
    else {
      val (rest, e) = removeAt((new Random).nextInt(list.length), list)
      e :: randomSelect2(i - 1, rest)
    }
  }

  def removeAt[A](i:Int, list:List[A]): (List[A], A) = {
    if (i < 0 || i >= list.length) sys.error("error!")
    val b  = list.toBuffer
    val br = b.remove(i)
    (b.toList, br)
  }
}
