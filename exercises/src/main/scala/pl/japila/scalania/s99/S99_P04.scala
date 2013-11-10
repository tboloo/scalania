package pl.japila.scalania.s99

object S99_P04 {
  def length[T](ts: Seq[T]): Int = ts match {
    case Nil => 0
    case h :: t => 1 + length(t)
  }

}
