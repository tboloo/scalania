package pl.japila.scalania.s99

object S99_P14 {
  def duplicate[T](ts: Seq[T]): Seq[T] = (ts map (e => Seq(e) :+ e)).flatten
}
