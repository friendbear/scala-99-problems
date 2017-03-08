/**
  * Created by n.kusagaya on 2017/03/03.
  */
object ScalaQuiz7 {
  def main(args: Array[String]): Unit = {
//    val list  = List(1, 2, 3, 2, 1)
//    val listB = List(1, 2, 3, 3, 1)
    val listA = List(List(1, List(1)), List(2, List(3, List(5, 8))))
    val listB = List("a", List("b", "c"), List("d", List("c")), List("b"), "a")
    println(flatten2(listB))
  }

  def flatten(list: List[Any]): List[Any] = {
    val newList = List()
    list.flatMap(tmp => tmp match {
      case x:List[_] => flatten(x)
      case x:Any => x :: newList
      case _ => sys.error("error!")
    })
  }

  def flatten2(list: List[Any]): List[Any] = list flatMap {
    case ms: List[_] => flatten2(ms)
    case e => List(e)
  }

//  def flatten(list:List[Any]):List[Any] = list match {
//    case (x:List[_])::y => flatten(x):::flatten(y)
//    case x::y => x::flatten(y)
//    case Nil => Nil
//  }

//  def flatten[T](list: List[T]):List[T] = {
//    def loop[T](tempList:List[T], flattList:List[T]):List[T] = tempList match {
//      case Nil => flattList
//      case x::y => {
//        val z = x match {
//          case x:List[Any] => {
//
//            flattList ::: x
//          }
//          case x:Any  => flattList :+ x
//        }
//        loop(y, z)
//      }
//    }
//    loop(list, List())
//  }
}
