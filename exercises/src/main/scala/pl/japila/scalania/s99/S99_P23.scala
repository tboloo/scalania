package pl.japila.scalania.s99
import scala.util._

object S99_P23 {
  def randomSelect[T](count: Int, ts: Seq[T]): Seq[T] = (count, ts) match {
    case (_, Nil) => Nil
    case (0, _) => Nil
    case (n, xs) => {
      val r = new Random
      val i = r nextInt (xs.size)
      Seq(ts(i)) ++ randomSelect(n - 1, xs.take(i) ++ xs.drop(i + 1))
    }
  }

}
