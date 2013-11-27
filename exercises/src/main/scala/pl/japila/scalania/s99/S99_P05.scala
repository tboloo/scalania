package pl.japila.scalania.s99

object S99_P05 {
  def reverse[T](ts: Seq[T]): Seq[T] = ts match {
    case Nil => Nil
    case h :: t => reverse(t) :+ h
  }

}
