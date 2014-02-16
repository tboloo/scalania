package pl.japila.scalania.s99

object S99_P16 {
  def drop[T](n: Int, ts: Seq[T]): Seq[T] = {
    (for {
      i <- 1 to ts.size if i % n != 0
    } yield ts(i - 1)).toList
  }
}
