package pl.japila.scalania.s99

object S99_P21 {
  def insertAt[T](toAdd: T, position: Int, ts: Seq[T]): Seq[T] = (position, ts) match {
    case (0, h :: t) => Seq(toAdd) ++ t
    case (position, h :: t) => Seq(h) ++ insertAt(toAdd, position - 1, t)
  }
}
