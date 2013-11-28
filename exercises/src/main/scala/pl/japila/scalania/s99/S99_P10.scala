package pl.japila.scalania.s99

object S99_P10 {
  def encode[T](ts: Seq[T]): Seq[(Int, T)] = ts match {
    case Nil => Nil
    case h :: t => t.foldLeft(Seq((1, h)))(
      (acc, elem) =>
        if (acc.head._2 == elem) (acc.head._1 + 1, acc.head._2) +: acc.tail
        else (1, elem) +: acc).reverse
  }
}
