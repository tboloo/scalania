package pl.japila.scalania.s99

object S99_P03 {
  def nth[T](k: Int, ts: Seq[T]): T = (k, ts) match {
    case (0, h :: t) => h
    case (k, h :: t) => nth(k - 1, t)
  }

}
