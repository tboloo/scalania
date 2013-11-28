package pl.japila.scalania.s99

object S99_P09 {
  def pack[T](ts: Seq[T]): Seq[Seq[T]] = ts match {
    case Nil => Nil
    case h :: t => t.foldLeft(Seq(Seq(h)))(
      (acc, elem) => if (acc.head.head == elem) Seq(elem +: acc.head) ++ acc.tail else Seq(elem) +: acc).reverse
  }
}
