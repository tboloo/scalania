package pl.japila.scalania.s99

object S99_P18 {
  def slice[T](from: Int, to: Int, ts: Seq[T]): Seq[T] = {
    (for { i <- from until to } yield ts(i)).toList
  }
}
