package pl.japila.scalania.s99

object S99_P08 {
  def compress[T](ts: Seq[T]): Seq[T] = ts match {
    case Nil => Nil
    case _ => ts.foldLeft(Seq(ts.head))(
      (acc, elem) => if (elem == acc.head) acc
      else Seq(elem) ++ acc).reverse
  }

  def compress2[T](ts: Seq[T]): Seq[T] = ts match {
    case Nil => Nil
    case h :: t => compressRec(h, t)
  }
  def compressRec[T](e: T, l: Seq[T]): Seq[T] = (e, l) match {
    case (_, Nil) => Nil
    case (e, Seq(h)) => Seq(h)
    case (e, h :: t) if e == h => compressRec(e, t)
    case (e, h :: t) if e != h => e +: compressRec(h, t)
  }
}
