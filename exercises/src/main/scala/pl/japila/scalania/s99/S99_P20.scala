package pl.japila.scalania.s99

object S99_P20 {
  //def removeAt[T](n: Int, ts: Seq[T]): (Seq[T], T) = (ts.take(n) ++ ts.drop(n+1), ts(n))

  def removeAt[T](n: Int, ts: Seq[T]): (Seq[T], T) = {
    def inner[T](n: Int, ts: Seq[T]): Seq[T] = (n, ts) match {
      case (0, h :: t) => t
      case (n, h :: t) => Seq(h) ++ inner(n - 1, t)
    }
    (inner(n, ts), ts(n))
  }
}